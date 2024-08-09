package com.sgtest.constructor;
class Newspaper
{
    String newspapername;
    String newspaperLang;
    int numofpages;
    int costofNewspaper;
    Newspaper(String name,String lang,int pages,int cost)
    {
        newspapername=name;
        newspaperLang=lang;
        numofpages=pages;
        costofNewspaper=cost;
        System.out.println("Newspaper :"+newspapername);
        System.out.println("Newspaperlang :"+newspaperLang);
        System.out.println("numofpages:"+numofpages);
        System.out.println("costofNewspaper:"+costofNewspaper);
    }
}
class Magazine
{
    String magazinename ;
    String magazinepublisher;
    int numofpages;
    int priceofmagazine;
    Magazine(String name,String Name,int pages,int cost)
    {
        magazinename=name;
        magazinepublisher=Name;
        numofpages=pages;
        priceofmagazine=cost;
        System.out.println("magazine name :"+magazinename);
        System.out.println("magazine publisher :"+magazinepublisher);
        System.out.println("num of pages:"+numofpages);
        System.out.println("price of magazine:"+priceofmagazine);
    }
}
class Comics
{
    String comicsname;
    String  authorname;
    int publishedyear;
    Comics(String name,String Name,int year)
    {
       comicsname=name;
       authorname=Name;
       publishedyear=year;
        System.out.println("comics:"+comicsname);
        System.out.println("authorname:"+authorname);
        System.out.println("year:"+publishedyear);
    }
}
public class ParameterizedConstructor4 {
    public static void main(String[] args)
    {
        Newspaper o1=new Newspaper("Vijayavani","kannada",7,23);
        Magazine o2=new Magazine("chatgpt empire","Empire",45,450);
        Comics o3=new Comics("Superman","Jerry Siegel",1938);
    }
}
