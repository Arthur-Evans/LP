package com.zx.entity;

public class UserRoot {

    enum enumUserRoot{
        Teacher("教职工"){
            @Override
            public void describe() {

            }
        }, Student("学生"){
            @Override
            public void describe() {

            }
        }, Engineer("管理人员"){
            @Override
            public void describe() {

            }
        };

        private final String rootName;
        public abstract void describe();

        enumUserRoot(String rootName){
            this.rootName = rootName;
        }

        public String toString(enumUserRoot e){
            return e.rootName;
        }
    };
}
