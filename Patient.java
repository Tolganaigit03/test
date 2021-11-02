public class Patient {
    private String name,surName,midName,address,diagnosis;
    private int id,phone,Card;



    public Patient(String name , String surName, String midName,String address,String diagnosis,int id,int phone,int Card){
        this.name = name;
        this.surName = surName;
        this.midName = midName;
        this.address = address;
        this.diagnosis =   diagnosis;
        this.id = id;
        this.phone = phone;
        this.Card =Card;
    }
    public Patient() {
        this.name = "";
        this.surName = "";
        this.midName = "";
        this.address = "";
        this.diagnosis = "";
        this.id = 0;
        this.phone = 0;
        this.Card = 0;
    }
    public void ShowInfo(){
        System.out.println(this.getsurName()+ "   "+ this.getname() + "   " + this.getmidName() + ":   Address: " + this.getaddress() + ";   PhonNumber: " + this.getphone() + "; Diagnosis: "+this.getDiagnosis() + ";  id: " + this.getid() + ";  #Card: " + this.getCard());
    }
    public String getname(){
        return name;
    }
    public String getsurName(){
        return surName;
    }
    public String getmidName(){
        return midName;
    }
    public String getaddress(){
        return address ;
    }
    public int getphone(){
        return phone;
    }
    public int getid(){
        return id;
    }
    public String getDiagnosis(){
        return diagnosis;
    }
    public int getCard(){
        return Card;
    }
    public void setname(String name) {
        this.name = name;
    }

    public void setsurName(String surName) {
        this.surName = this.surName;
    }

    public void setmidName(String midName) {
        this.midName = midName;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public void setphone(int phone) {
        this.phone = phone;
    }


    public void setCard(int card) {
        Card = card;
    }


    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
