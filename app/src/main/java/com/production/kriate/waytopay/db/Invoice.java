package com.production.kriate.waytopay.db;

import java.io.Serializable;

/**
 * Created by weerc on 28.09.2015.
 */
public class Invoice implements Serializable {
    public static final long EMPTY_ID = -1;

    private final long mId;       // Идентификатор шаблона в базе
    private final String mTitleSms;  // Название шаблона

    public Invoice(long mId, String mTitleSms) {
        this.mId = mId;
        this.mTitleSms = mTitleSms;
    }

    public  Invoice getEmptyInvoice()
    {
        return new Invoice(EMPTY_ID, "");
    }
}
