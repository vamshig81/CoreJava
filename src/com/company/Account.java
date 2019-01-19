package com.company;

public final class Account
{
    private final int accountNumber;
    private String holderName;

    public Account(int accountNumber, String abc) {
        this.accountNumber = accountNumber;
        this.holderName = abc;
    }

    public String getHolderName() {
        return holderName;
    }

/*
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
*/

    public int getAccountNumber() {
        return accountNumber;
    }


    //Depends only on account number

    @Override
    public int hashCode() {
        //System.out.println("hi hashcode 1234 ");

        final int prime = 31;
        int result = 1;
        result = prime * result + accountNumber;
        System.out.println("hash code   "+result);
        return result;
    }

    //Compare only account numbers
    @Override
    public boolean equals(Object obj) {
        //System.out.println("hi equals 1234 ");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (accountNumber != other.accountNumber)
            return false;
        return true;
    }
}