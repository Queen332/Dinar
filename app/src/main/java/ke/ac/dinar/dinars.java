package ke.ac.dinar;

public class dinars {


    public String name;
    public String phone_number;
    public int picture;

    public dinars(String name, String phone_number, int picture) {
        this.name = name;
        this.phone_number = phone_number;
        this.picture = picture;
    }

    {
        this.name=name;
        this.phone_number=phone_number;
        this.picture=picture;

    }


    public dinars(){}
    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    public String getPhone_number(){
        return phone_number;
    }
    public void setPhone_number(){
        this.phone_number= phone_number;
    }

    public int getPicture() { return picture;}
    public void setPicture(int picture) {this.picture = picture;
    }

}
