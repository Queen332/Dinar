package ke.ac.dinar.model;

public class dinar {
    public String name;
    public int phone_number;
    public int picture;

    public dinar(String name, int phone_number, int picture) {

    }

    {
        this.name=name;
        this.phone_number=phone_number;
        this.picture=picture;
    }

    public dinar(){}
    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    public int getPhone_number(){
        return phone_number;
    }
    public void setPhone_number(){
        this.phone_number= phone_number;
    }

    public int getPicture() { return picture;}
    public void setPicture(int picture) {this.picture = picture;
    }

}

