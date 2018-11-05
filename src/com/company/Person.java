package com.company;

public class Person {

    private String name;
    private String surname;
    private String lastname;
    private String adress;
    private String tNumber;
    private String aInfo;

    public String getName ( )
    {
        return name;
    }

    public void setName (String name)
    {
        name = name;
    }
    public String getSurname( )
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        surname = surname;
    }
    public String getLastname ( )
    {
        return lastname;
    }

    public void setLastname (String lastname)
    {
        lastname = lastname;
    }
    public String gettNumber ( )
    {
        return tNumber;
    }

    public void settNumber (String tNumber)
    {
        tNumber = tNumber;
    }
    public String getAdress (String adress )
    {
        return adress;
    }

    public void setAdress (String adress)
    {
        adress = adress;
    }
    public String getaInfo(String aInfo )
    {
        return aInfo;
    }

    public void setaInfo (String aInfo)
    {
        aInfo = aInfo;
    }



    public Person(String name, String surname,String lastname, String adress,String tNumber,String aInfo) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.adress = adress;
        this.tNumber = tNumber;
        this.aInfo = aInfo;
    }


    @Override
    public String toString() {
        return   name + "\t" + surname + "\t"+ lastname+"\t"+adress+"\t"+tNumber+"\t"+aInfo;
    }


}