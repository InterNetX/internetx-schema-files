package com.internetx.adapter;

import java.util.Currency;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class CurrencyAdapter extends XmlAdapter<String, Currency> {

	@Override
	public Currency unmarshal(String v) {
		if(v == null || v.length() == 0)
			return null;
		return Currency.getInstance(v);
	}

	@Override
	public String marshal(Currency v) throws Exception {
		return v != null ? v.getCurrencyCode() : null;
	}


}
