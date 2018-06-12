package com.android9527.dsl.http

import com.google.gson.GsonBuilder
import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import okhttp3.*
import java.util.*
import java.util.concurrent.TimeUnit

class RequestWrapper {

    var url: String = ""

    var method: String? = null

    var requestBody: RequestBody? = null

    var header: Map<String, String?>? = null
    var parameter: MutableMap<String, String>? = null

    internal var _success: (Response?) -> Unit = { }
    internal var _fail: (Throwable) -> Unit = {}

    fun onSuccess(onSuccess: (Response?) -> Unit) {
        _success = onSuccess
    }

    fun onFail(onError: (Throwable) -> Unit) {
        _fail = onError
    }
}

class Method {

    companion object {
        const val GET = "GET"
        const val POST = "POST"
        const val HEAD = "HEAD"
        const val DELETE = "DELETE"
        const val PUT = "PUT"
        const val PATCH = "PATCH"
    }
}

fun http(init: RequestWrapper.() -> Unit) {
    val wrap = RequestWrapper()

    wrap.init()

    executeForResult(wrap)
}

private fun executeForResult(wrap: RequestWrapper) {
//    onExecute(wrap)
    Flowable.create<Response>({ e ->
        onExecute(wrap)?.let { e.onNext(it) }
    }, BackpressureStrategy.BUFFER)
//            .subscribeOn(Schedulers.io())
            .subscribe(
                    { response ->
                        wrap._success(response)
                    },

                    { exception -> wrap._fail(exception) })
}

private fun onExecute(wrap: RequestWrapper): Response? {

    val request: Request?
    val builder = Request.Builder().url(wrap.url)
    var headers: Headers? = null
    if (wrap.header != null && !wrap.header!!.isNotEmpty()) {
        headers = Headers.of(wrap.header!!)
    }
    if (headers != null) {
        builder.headers(headers)
    }

    var formBody: RequestBody? = null

    when (wrap.method) {
        Method.GET, Method.HEAD -> {

            val httpBuilder = HttpUrl.parse(wrap.url)!!.newBuilder()
            if (wrap.parameter != null) {
                for (param in wrap.parameter!!.entries) {
                    httpBuilder.addQueryParameter(param.key, param.value)
                }
            }
            builder.url(httpBuilder.build())
        }

        else -> {
            // Initialize Builder (not RequestBody)
            if (wrap.parameter != null /*&& wrap.queryMap!!.isNotEmpty()*/) {
                val bodyBuilder = FormBody.Builder()
                // Add Params to Builder
                for (entry in wrap.parameter!!.entries) {
                    bodyBuilder.add(entry.key, entry.value)
                }
                // Create RequestBody
                formBody = bodyBuilder.build()
            }
        }
    }

    request = builder.method(wrap.method, formBody).build()
    val http = OkHttpClient.Builder().connectTimeout(10000, TimeUnit.SECONDS).build()
    val response = http.newCall(request).execute()
    return response
}


fun main(args: Array<String>) {
    testGet()
//    post()
}

fun testGet():String? {
    var result :String? = null
    http {
        url = "http://app-static.caifuxq.com/v1/revs/css/common.css?v=2016080701"
        method = "GET"
        parameter = HashMap()
        onSuccess { response ->
            println(response?.headers()?.toMultimap())
            result = response?.body()?.string()
        }

        onFail { e ->
            e.printStackTrace()
        }
    }
    println( "---------->" + result)
    return result
}

fun post() {
    var json = GsonBuilder().create()

    val map = HashMap<String, String?>()
    map.put("xxx", "yyyy")

    val postBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json.toJson(map))

    http {
        url = "https://www.baidu.com"

        method = "post"

        onSuccess { string ->
            println(string)
        }

        onFail { e ->
            println(e.message)
        }
    }
}
