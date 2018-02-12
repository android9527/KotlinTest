package com.android9527.lambada;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;

/**
 * Created by chenfeiyue on 18/2/7.
 * Description:
 */
public class TestJava {

    private void test() {
        View view = new View();
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(@NotNull View view) {

            }
        });
    }


    public static void main(String[] args) {
        Flowable.just("Hello,I am China!")
                //替代1.x中的action1,接收一个参数，如果是两个参数action2使用BiCustomer，而且删除了action3-9
                //多个参数用Custom<Object[]>
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                    }
                });
    }
}
