package com.sgtest.constructor;
class Newspaper1
{
    String newspapername;
    String newspaperLang;
    int numofpages;
    int costofNewspaper;
    Newspaper1(String newspapername,String newspaperLang,int numofpages,int costofNewspaper)
    {
        this.newspapername=newspapername;
        this.newspaperLang=newspaperLang;
        this.numofpages=numofpages;
        this.costofNewspaper=costofNewspaper;
        System.out.println("Newspaper :"+newspapername);
        System.out.println("Newspaperlang :"+newspaperLang);
        System.out.println("numofpages:"+numofpages);
        System.out.println("costofNewspaper:"+costofNewspaper);
    }
}
class Magazine1
{
    String magazinename ;
    String magazinepublisher;
    int numofpages;
    int priceofmagazine;
    Magazine1(String magazinename,String magazinepublisher,int numofpages,int priceofmagazine)
    {
        this.magazinename=magazinename;
        this.magazinepublisher=magazinepublisher;
        this.numofpages=numofpages;
        this.priceofmagazine=priceofmagazine;
        System.out.println("magazine name :"+magazinename);
        System.out.println("magazine publisher :"+magazinepublisher);
        System.out.println("num of pages:"+numofpages);
        System.out.println("price of magazine:"+priceofmagazine);
    }
}
class Comics1
{
    String comicsname;
    String  authorname;
    int publishedyear;
    Comics1(String comicsname,String authorname,int publishedyear)
    {
        this.comicsname=comicsname;
        this.authorname=authorname;
        this.publishedyear=publishedyear;
        System.out.println("comics:"+comicsname);
        System.out.println("authorname:"+authorname);
        System.out.println("year:"+publishedyear);
    }
}
public class Thisoperator4 {
    public static void main(String[] args)
    {
        Newspaper o1=new Newspaper("Vijayavani","kannada",7,23);
        Magazine o2=new Magazine("chatgpt empire","Empire",45,450);
        Comics o3=new Comics("Superman","Jerry Siegel",1938);
    }
}

