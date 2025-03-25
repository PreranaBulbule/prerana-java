package com.xworkz.IdCard;

public class IdCardRunner {
    public static void main(String[] args) {
        IdCardArray idCardArray = new IdCardArray();
        idCardArray.showCards();

        ParaId paraId=new ParaId();
        UseParaId useParaId=new UseParaId();
        useParaId.neck(paraId);
    }
}
