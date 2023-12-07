package com.intellij1.flightmodel;

class Passenger implements Comparable<Passenger>{
    private String name;
    private int memberDays;
    private int memberLevel;//3 level-- highest priority

    public Passenger(){

    }
    public Passenger(String name)
    {
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(int memberLevel) {
        this.memberLevel = memberLevel;
    }

    public int getMemberDays() {
        return memberDays;
    }

    public void setMemberDays(int memberDays) {
        this.memberDays = memberDays;
    }


    public Passenger(String name, int memberLevel,int memberDays)
    {
        this(name);
        this.memberDays=memberDays;
        this.memberLevel=memberLevel;
    }

//negative indicates current ordered before
    @Override
    public int compareTo(Passenger p) {
        int returnValue;
         returnValue=p.memberLevel-memberLevel;
        if(returnValue==0)
            returnValue =p.memberDays-memberDays;
        return returnValue;
    }
}
