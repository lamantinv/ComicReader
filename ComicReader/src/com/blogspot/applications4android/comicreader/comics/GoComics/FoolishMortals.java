package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class FoolishMortals extends DailyGoComicsCom {
	public FoolishMortals() {
		super();
		mComicName = "foolish-mortals";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2012, 8, 12);
	}
}
