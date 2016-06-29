package com.app.dprokopiuk.module04.sample3;

/**
 * Created by Администратор on 25.06.2016.
 */
public class Phone {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    //==
    public boolean equlas(Object obj) {
         return obj == this;
    }*/

    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(obj==this){
            return true;
        }
        if(obj.getClass()==Phone.class){
            Phone phone = (Phone) obj;
            if(name!=null){
                return name.equals(phone.name);
            }
            if(phone.name!=null){
                return phone.name.equals(name);
            }
        }
        return false;
    }

    public int hashCode(){
        /*if(name==null){
            return 0;
        }
        return name.hashCode();*/
        return name==null ? 0 : name.hashCode();
    }

}
