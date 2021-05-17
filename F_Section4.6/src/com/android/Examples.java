package com.android;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import java.time.temporal.ChronoUnit;

public class Examples {
	private Examples() {
		/*
		 * a Class that only contains static methods is not meant to be 
		 * instantiated. however java by default creates a hidden default,
		 * public, no argument constructor. so you can still create a 
		 * member of this class. however if you have a user defined constructor
		 * that is private, you can no longer create an Examples object
		 */
	}
	/*
	 * dates in java are called LocalDate, default is
	 * American format which is YYYY-dd-mm
	 * time in java is called LocalTime, the default which
	 * is 24 hour format which is hh:mm:ss.99999999
	 * LocalDateTime is a combination of both of the above
	 * Java 8 has new classes to deal with times and dates,
	 * previous to this times and dates were VERY AWKWARD
	 */
	static void ex1() {
		//dates called LocalDate
		/*
		 * you can't directly create a date or time object
		 * (can't use new). you create a date object by
		 * using the static method "of"
		 */
	//	LocalDate myDate=new LocalDate();
		//have to input date in american format
		LocalDate date1=LocalDate.of(2222, 1, 25);
		System.out.println("date1 is "+date1);
		//this is todays date
		LocalDate dateNow=LocalDate.now();
		System.out.println("tody is "+dateNow);
		//just another way of putting in the month
		LocalDate date2=LocalDate.of(2018, Month.JULY, 22);
		System.out.println("in jul "+date2);
		//all time and date clases also have parsers
		/*
		 * for converting times in a string into a date
		 * or time or datetime
		 * text to be parsered as a date, needs to be in
		 * correct american format
		 * YYYY-mm-dd
		 */
		date2=LocalDate.parse("2018-08-02");
		System.out.println("our parsed date is "+date2);
		/*
		 * LocalDate has various get methods, that allow
		 * you to get a month from a date, year from a date
		 * , day of week from a date, etc
		 */
		System.out.println("get methods");
		System.out.println("month "+dateNow.getDayOfMonth());
		System.out.println("day of week "+dateNow.getDayOfWeek());
		System.out.println("day of year "+dateNow.getDayOfYear());
		System.out.println("month of year "+dateNow.getMonth());
		System.out.println("numbered month of the year "+
		dateNow.getMonthValue());
		System.out.println("year "+dateNow.getYear());
		
		LocalDate xmas=LocalDate.of(2017, 12, 25);
		LocalDate paddys=LocalDate.of(2017, 3, 17);
		
		System.out.println("xmas before paddys");
		System.out.println(xmas.isBefore(paddys));//false
		System.out.println("xmas after paddys");
		System.out.println(xmas.isAfter(paddys));//true
		System.out.println("two dates equals");
		System.out.println(xmas.equals(paddys));//false
		//this does not work
		//System.out.println(paddys<xmas);
		xmas=xmas.minusDays(10);
		System.out.println(xmas);
		xmas=xmas.minusMonths(2);
		System.out.println(xmas);
		xmas=xmas.minusWeeks(12);
		System.out.println(xmas);
		xmas=xmas.minusYears(5);
		System.out.println(xmas);
		/*
		 * LocalDate, LocalTime, LocalDateTime are like
		 * the string class in that they are immutable
		 * and can't change
		 */
		date1=LocalDate.of(2016, 12, 27);
		/*
		 * this produces a brand new date, it does  not modify
		 * date1
		 */
		System.out.println("tens days on "+date1.plusDays(10));
		/*
		 * date1 is still 27th of December 2017
		 */
		System.out.println("date1 is still "+date1);
		System.out.println(date1.plusWeeks(4));
		System.out.println(date1.plusMonths(13));
		System.out.println(date1.plusYears(5));
		
		date1=LocalDate.of(2000, 1, 1);
		System.out.println("milleninum "+date1);
		System.out.println(date1.plusMonths(2).plusYears(3));
		
		LocalDate addDate;
		/*
		 * this does 59 days plus our date, which is
		 * 29th February 2000, then adds one year, but there
		 * is NOT 29TH february in 2001, so it will display
		 * last day in month of february in 2001, which is
		 * the 28th of february
		 */
		addDate=date1.plusDays(59).plusYears(1);
		System.out.println(addDate);
		
		date1=LocalDate.of(2016, 2, 29);
		//will display 2109-02-28
		System.out.println(date1.plusYears(3));
		/*
		 * with() methos, returns a copy of the date
		 * with a replacement for the day, month or year
		 */
		date1=LocalDate.of(2016, 12, 27);
		System.out.println("with");
		System.out.println(date1.withDayOfMonth(14));
		System.out.println(date1.withMonth(10));
		System.out.println(date1.withYear(2987));
		//this affects both days and months
		System.out.println(date1.withDayOfYear(100));
		/*
		 * atTime, this is for converting a LocalDate to
		 * a LocalDateTime
		 */
		date1=LocalDate.of(2016, 12, 27);
		//this produces a dateTime of 2016-12-27T16:30
		System.out.println(date1.atTime(16,30));
		System.out.println(date1.atTime(17, 30, 30));
		System.out.println(date1.atTime(2, 15, 45, 56746));
		System.out.println(date1.atTime(LocalTime.of(16, 30)));
		LocalDate earlyDate=
		LocalDate.of(1970, Month.JANUARY, 4);
		System.out.println(earlyDate);
		System.out.println(earlyDate.toEpochDay());
		//System.out.println("min date is "+LocalDate.MIN);
		System.out.println(LocalDate.now().toEpochDay());
		
		LocalDate preEpoc=LocalDate.of(1959, 10, 12);
		System.out.println(preEpoc.plusDays(45).plusMonths(2));
		System.out.println(preEpoc.toEpochDay()+10);
		System.out.println(preEpoc);
		
		System.out.println("max date");
		System.out.println(LocalDate.MAX);
		System.out.println("min date");
		System.out.println(LocalDate.MIN);
		
		System.out.println(LocalDate.now().getEra());
		System.out.println(
		LocalDate.now().minusYears(10000).getEra());
	
	}//end of ex1
	
	static void ex2() {
		/*
		 * time in java 8 uses the class LocalTime
		 * LocalTime stores in format hours-minutes-seconds
		 * -nanoseconds (without timezone)
		 * Like LocalDate, LocalTime is immutable
		 * created in a similar way to LocalDate and
		 * is displayed as a 24 hour clock by default
		 */
		LocalTime time1=LocalTime.of(13,12);//hours minutes
		System.out.println(time1);
		time1=LocalTime.of(13, 20,45);//hours minutes seconds
		System.out.println(time1);
		time1=LocalTime.of(14, 40,56,777);
		System.out.println(time1);
		//no am or pm in LocalTime
		
		LocalTime time2;
		/*
		 * this will generate a DateTimeException, as only
		 * 60 minutes in an hour
		 */
		//time2=LocalTime.of(2,61,65);
		/*
		 * LocalTime, like LocalDate also has parsers
		 * so can take a string time and convert to a 
		 * LocalTime value
		 * has to be in correct format
		 */
		time2=LocalTime.parse("16:06");
		System.out.println("parsed time "+time2);
		System.out.println("current time "+LocalTime.now());
		//midnight and min are the same time
		LocalTime midDay=LocalTime.NOON;//12:00 midday
		LocalTime midNight=LocalTime.MIDNIGHT;//00:00:00.00
		LocalTime minTime=LocalTime.MIN;//00:00:00.00
		LocalTime maxTime=LocalTime.MAX;//23:59:59.999999999
		
		LocalTime rightNow=LocalTime.now();
		System.out.println("hour of now is "+rightNow.getHour());
		System.out.println("minute of now is "+rightNow.getMinute());
		System.out.println("second of now is "+rightNow.getSecond());
		System.out.println("nano of now is "+rightNow.getNano());
		
		System.out.println("plustimes");
		System.out.println(rightNow.plusHours(2));
		System.out.println(rightNow.plusMinutes(90));
		System.out.println("minustimes");
		System.out.println(rightNow.minusHours(2).minusMinutes(10));
		
		System.out.println(midDay.isAfter(rightNow));
		System.out.println(midDay.isBefore(rightNow));
		
		System.out.println(rightNow.minusHours(4).isBefore(midDay));
		
		
			
		
		/*
		if(timmyTime.isBefore(startTime)||timmyTime.equals(startTime)){
			System.out.println("timmy is on time");
		}
		else
			System.out.println("Timmy is late");*/
		LocalTime startTime=LocalTime.of(8, 30);
		LocalTime timmyTime=LocalTime.of(8, 15);
		if(timmyTime.isAfter(startTime)) {
			System.out.println("you are late");
		}
		else
			System.out.println("you are on time");
		/*
		 * check if the time you run a mile in breaks the 
		 * world record
		 */
		//this  number is 3 minutes, 59 seconds and 
		//.000000013 seconds, or 13 nanoseconds
		LocalTime worldRecord=LocalTime.of(0, 3,59,13);
		LocalTime myTime=LocalTime.of(0, 3,59);
		if(myTime.isBefore(worldRecord)) {
			System.out.println("new World Record");
		}
		else
			System.out.println("tough Luck");
		System.out.println(worldRecord);
		/*
		 * withHour(), withMinute(), etc accept an int value and
		 * returns a copy of the the LocalTime with the specified
		 * value altered
		 */
		time2=LocalTime.of(12, 30,30);
		System.out.println("time 2 is "+time2);
		System.out.println(time2.withHour(14));
		System.out.println(time2.withMinute(15));
		System.out.println("time2 is still "+time2);
		
		myTime=LocalTime.now();
		System.out.println(myTime.getNano());
		
		///LocalDate date1=LocalDate.now();	
	}//end of ex2
	
	static void ex3() {
		LocalDateTime dateTime1=LocalDateTime.of
				/*
				 * year 2212
				 * month april
				 * day 20
				 * hour 23
				 * minute 15
				 * second 50
				 * nanosecond 675
				 */
				(2212,Month.APRIL,20,23,15,50,675);
		//todays date
		LocalDate date1=LocalDate.now();
		//the time of now
		LocalTime time1=LocalTime.now();
		//combination of date and time gives us a dateTime
		dateTime1=LocalDateTime.of(date1,time1);
		System.out.println("dateTime1 is "+dateTime1);
		//this will get us the current date and time
		dateTime1=LocalDateTime.now();
		System.out.println("dateTime of now is "+dateTime1);
		/*
		 * all the methods available to LocalDate and LocalTime
		 * are also available to LocalDateTime
		 */
	}//end of ex3
	
	static void ex4() {
		/*
		 * length of times in java are called periods
		 * you can have a period of nanosecond, minutes, hours,
		 * days, weeks, months, years, epoch,era or a combination 
		 * of them. ie a period of two years, four months, two weeks and
		 * three days
		 */
		Period yearPeriod=Period.ofYears(3);
		Period monthPeriod=Period.ofMonths(11);
		Period weekPeriod=Period.ofWeeks(4);
		Period dayPeriod=Period.ofDays(56);
		LocalDate today=LocalDate.now();
		//adds 58 days to current date
		System.out.println(today.plus(dayPeriod));
		System.out.println(today.plus(yearPeriod));
		System.out.println(today.plus(weekPeriod));
		System.out.println(today.plus(monthPeriod));
		/*
		 * This is a time period of 2 years
		 * 3 months 
		 * 456 days
		 */
		Period per1=Period.of(2, 3, 456);
		System.out.println("today plus per1 "+today.plus(per1));
		System.out.println("today minus per1 "+today.minus(per1));
		//-(-20) is a plus, +(-20) is a minus
		Period dayMinus=Period.ofDays(-20);
		/*
		 * this is minus by minus, which gives us a plus, so this
		 * adds 20 onto todays date
		 */
		System.out.println("now minus 20 "+today.minus(dayMinus));
		/*
		 * this is plus by minus, which gives us a minus, so this
		 * subtracts 20 days from todays date
		 */
		System.out.println("now plus minus 20 "+today.plus(dayMinus));
		
		LocalDate date1=LocalDate.of(2010, 2, 12);
		LocalDate date2=LocalDate.of(2030, Month.APRIL, 2);
		/*
		 * this will get the period between date1 and date2
		 */
		Period betweenDates=Period.between(date1, date2);
		/*
		 * P20Y1M21D
		 * this printout means P stands for period
		 * 20Y means 20 years
		 * 1M means 1 month
		 * 21D means 21 days
		 */
		System.out.println("betweenDates is "+betweenDates);
		//this only gets the amount of days, namely 21 days
		System.out.println("betweenDates days "+
				betweenDates.getDays());
		System.out.println(betweenDates.getMonths());//1
		System.out.println(betweenDates.getYears());//20 years
		
		per1=Period.of(2, 3,456);
		System.out.println(per1.getMonths());//3
		System.out.println(per1.getDays());//456
		System.out.println(per1.getYears());//2
		
		/*
		 * you can do some limited comparing with periods
		 */
		System.out.println("comparing days with months in two different periods");
	//	per1=Period.ofMonths(1);
	//	Period per2=Period.ofDays(30);
		System.out.println(per1.getDays()>betweenDates.getMonths());
	//	System.out.println(per1.getDays()==per2.getMonths());
		//you can't compare two periods directly
	//	System.out.println(per1>betweenDates);
		
		Period ofMonths=Period.ofMonths(1);
		Period ofDays=Period.ofDays(10);
		System.out.println("ofDays in months "+ofDays.getMonths());
		System.out.println("ofMonths in days "+ofMonths.getDays());
		/*
		 * this is NOT comparing the time units (its not comparing a 
		 * time period of 30 days in a month with 10 days).
		 * ofMonths.getMonths returns the amount of months in a period,
		 * which is the number 1
		 * ofDays.getDays returns the amount of days in a period, which
		 * is 10 so the below actually reads, so its comparing the number 1
		 * with the number 10
		 * system.out.println(1<10)//which is true
		 */
		System.out.println(ofMonths.getMonths()<ofDays.getDays());
		
		Period days1=Period.ofDays(12);
		Period days2=Period.ofMonths(12);
		//false, because two different objects with same time period
		System.out.println(days1==days2);
		System.out.println(days1.getDays()==days2.getMonths());
	}
	
	static void ex5() {
		//date film started showings in local cinema
		LocalDate filmOpening=LocalDate.of(2017, 12, 3);
		//date film stopped showing in local cinema
		LocalDate filmClosing=LocalDate.of(2018, 2, 14);
		/*
		 * the time period the film plays for is the time between
		 * filmopening and filmclosing
		 */
		Period filmTime=Period.between(filmOpening, filmClosing);
		System.out.println("film plays for "+filmTime);
		
		LocalDate today=LocalDate.now();
		LocalDate century=today.plusYears(100);
		System.out.println("100 years from now "+century);
		
		LocalDate finishTime=today.plus(filmTime);
		
		/*
		 * want to show the finishing times for the next 100 years
		 * for our films
		 */
		while(finishTime.isBefore(century)) {
			System.out.println("our film finishes it's run in " +finishTime);
			//keeps adding the filmTime time period of 2 months and 11 days
			//until it is after 100 years from now
			finishTime=finishTime.plus(filmTime);
		}	
	}//end of ex5
	
	static void ex6() {
		/*
		 * you can't really compare periods directly, as 2 months could
		 * mean 62 days(july,August) or 61 day(march,april)
		 * so we use ChrnoUnit to get amount of day, weeks, in a date in
		 * relation to a fixed point in time (i.e two months starting
		 * 01-01-2018 will us a days amount of 59, in a leap year this
		 * amount of days would be 60)
		 */
		LocalDate today=LocalDate.now();
		LocalDate xmas=LocalDate.of(2018, Month.DECEMBER, 25);
		long p2=ChronoUnit.DAYS.between(xmas, today);
		System.out.println("there are "+p2+" days to christmas");
		
		Period per1=Period.between(today, xmas);
		System.out.println("per1 is "+per1);
		LocalDate date1=LocalDate.of(2018, 6, 20);
		
		LocalDate startDate=LocalDate.of(2016, 2, 3);
		LocalDate endDate=LocalDate.of(2022, 12, 24);
		Period betweenDates=Period.between(startDate, endDate);
		//this does not give you an EXACT period of time
		//this period totally depends on where the period is from
		//i.e if it starts on the 29 of february in a leap year
		System.out.println("betweenDates is "+betweenDates);
		
		long p3=ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println("days between start and end is "+p3);
		System.out.println(p2>p3);
		System.out.println(p2<p3);
		
		LocalTime rightNow=LocalTime.now();
		LocalTime twelve=LocalTime.NOON;
		long minutes=ChronoUnit.MINUTES.between(rightNow, twelve);
		System.out.println("minutes to noon is "+minutes);
		
		LocalTime midNite=LocalTime.MIDNIGHT;
		
		minutes=ChronoUnit.MINUTES.between(rightNow, midNite);
		System.out.println("minutes since midnight is "+minutes);
		minutes=ChronoUnit.MINUTES.between( midNite,rightNow);
		System.out.println("minutes since midnight and plus "+minutes);
		
		//p2 is long of 319
		System.out.println("p2 is "+p2);
		System.out.println("p3 is "+p3);
		int num=(int)p3;
		Period chrnoPeriod=Period.ofDays(num);
		
		per1=Period.of(2, 4, 22);
		today=LocalDate.now();
		//this is the amount of days from today to 2 years
		//4 months and 22 days in the future
		p3=ChronoUnit.DAYS.between(today, today.plus(per1));
		System.out.println("p3 is "+p3);
		LocalDate myDate=LocalDate.of(2220, Month.APRIL, 1);
		/*
		 * this is the amount of days from april 1st 2220 to 2 years
		 * 4 months and 22 days from it
		 */
		p3=ChronoUnit.DAYS.between(myDate, myDate.plus(per1));
		System.out.println("p3 is "+p3);	
	}//end of ex6
	
	static void ex7() {
		/*
		 * cannot chain methods of the Period class. this is only
		 * a period of 2 days it ignores the ofYears(2) and ofMonths(9)
		 */
		
		Period wrongPeriod=Period.ofYears(2).ofMonths(9).ofDays(2);
		LocalDate today=LocalDate.now();
		LocalDate future=today.plus(wrongPeriod);
		//this is only two days in the future, as period is only 2 days
		System.out.println("future is "+future);
		
		Period rightPeriod=Period.of(2, 9, 2);	
		
		Period per1=Period.of(1, 2, 10);
		Period per2=Period.of(2, 3, 4);
		/*
		 * adding perios, you only add up the individual elements.
		 * add up the days in the above you get 14 days, 10+4
		 * add up the months, 2+3 you get 5 months
		 * add up the years, 1+2 you get 3 years
		 */
		Period per3=per1.plus(per2);
		System.out.println("per1 plus per2 is "+per3);
		
		/*
		 can't multiply a period by another period, all you can do is
		 multiply a period by a number
		 */
		per1=Period.of(1, 2, 10);
		per2=Period.of(2, 3, 4);
		Period multiPeriod=per1.multipliedBy(3);
		System.out.println("multiplied by 3"+multiPeriod);
		/*
		 * minus
		 * operates same way as plus, we subtract days from days
		 * 4-10= -6
		 * subtract months from months
		 * 3-2 = 1
		 * subtract years from years
		 * 2-1 = 1
		 */
		Period minusPeriod=per2.minus(per1);
		System.out.println("minusPeriod is "+minusPeriod);
		
		/*
		 * isZero
		 * this returns true if year, month and date are set to 0. All
		 * have to be set to zero to be true
		 */
		System.out.println("is per1 zero "+per1.isZero());
		Period zeroPeriod=Period.of(0, 0, 0);
		System.out.println("zeroPeriod is "+zeroPeriod.isZero());
		/*
		 * isNegative() returns true if year, or month, or day are negative
		 * it returns true
		 */
		Period negPeriod=Period.of(12,-1,2);
		System.out.println("negPeriod is "+negPeriod.isNegative());
		per1=Period.of(2, 3, 5);//0 is treated as a positive number
		System.out.println("pers is it negative "+per1.isNegative());
	}
	
	static void ex8() {
		/*
		 * date and time formatters, to allow us to format dates in 
		 * whatever format we want. in our case in european format which
		 * is DD-MM-YYYY
		 */
		LocalDate today=LocalDate.now();
		System.out.println("today is in USA format "+today);
		/*
		 * creating a DateTimeFormatter for our dates and dateTimes in
		 * localised fromat. In our case it will be in the format 
		 * date/month/year. localized date will be set to European
		 * format.
		 * When creating formatters for LocalDate, LocalTime and 
		 * LocalDateTime they are all types of DateTimeFormatter. they
		 * differ in ofLocalizedDate for dates
		 * ofLocalizedDateTime for dateTimes
		 * ofLocalizedTime for times
		 */
		DateTimeFormatter shortDate=DateTimeFormatter.
				ofLocalizedDate(FormatStyle.SHORT);
		System.out.println("short format todays date in european format");
		System.out.println(today.format(shortDate));
		System.out.println("medium format todays date in european format");
		DateTimeFormatter mediumDate=DateTimeFormatter.
				ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(today.format(mediumDate));
		DateTimeFormatter fullDate=DateTimeFormatter.
				ofLocalizedDate(FormatStyle.FULL);
		//LONG is the same as full
		System.out.println("full fromat todays date in european format");
		System.out.println(today.format(fullDate));
		
		System.out.println("formatter for time");
		//notices ofLocalizedTime for time formatters
		DateTimeFormatter timeFormatter=DateTimeFormatter.
				ofLocalizedTime(FormatStyle.MEDIUM);
		LocalTime rightNow=LocalTime.now();
		System.out.println("time in medium "+rightNow.format(timeFormatter));
		
		timeFormatter=DateTimeFormatter.
				ofLocalizedTime(FormatStyle.SHORT);
		System.out.println("time in short "+rightNow.format(timeFormatter));
		
		/*
		 * there are a number of standard ISO formatters they are the
		 * following
		 */
		DateTimeFormatter formatter1=DateTimeFormatter.BASIC_ISO_DATE;
		//ISO_LOCAL_DATE, ISO_LOCAL_TIME, ISO_LOCAL_DATE_TIME are the
		//the default formaters for dates, times and datestimes in java
		//will print out date in like 20180212
		System.out.println("basic iso "+today.format(formatter1));
		DateTimeFormatter formatter2=DateTimeFormatter.ISO_LOCAL_DATE;
		//will print in format like 2018-02-12
		System.out.println("iso Local date "+today.format(formatter2));
		DateTimeFormatter formatter3=DateTimeFormatter.ISO_LOCAL_TIME;
		rightNow=LocalTime.now();
		//will print in format like 11:48:23.103
		System.out.println("iso locat time "+rightNow.format(formatter3));
		LocalDateTime nowDateTime=LocalDateTime.now();
		DateTimeFormatter formatter4=DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		//will print in format like 2018-02-12T11:48:23.103
		System.out.println("iso LocalDateTime "+nowDateTime.format(formatter4));
		/*
		 * each date or time type has to have it's own formatter, i.e
		 * you can't use a date formatter for a LocalTime
		 * we are trying to use a LocalTime formatter (formatter3) on
		 * a date (which is today). when we are using dates, we can
		 * only use dateformatters on them, similar for LocalTimes and
		 * LocalDateTimes
		 * this generates an exception as we are trying to format a 
		 * LocalDate with LocalTime Exception
		 */
		//System.out.println(today.format(formatter3));
	}//end of static void ex8

	static void ex9() {
		/*
		 * period parsers
		 * this is a period of 5 years
		 */
		Period p5=Period.parse("p5y");
		p5=Period.parse("P5Y");
		p5=Period.parse("+p5y");
		System.out.println(LocalDate.now().plus(p5));
		//period of 5 years 1 month 21 days
		Period multParse=Period.parse("p5y1m21d");
		System.out.println(LocalDate.now().plus(multParse));
		
		LocalDate today=LocalDate.now();
		LocalTime rightNow=LocalTime.now();
		LocalDateTime nowDateTime=LocalDateTime.now();
		/*
		 * D is day of the year
		 * e is day of the week (i.e monday first day of the week, number 1)
		 * dd is day of the month
		 * EEEE is the named day of the week (i.e Tuesday), EE is the 
		 * shortened version of Tue
		 * MMMM gives us the full  name of the month (ie October)
		 * M give us 2 for february
		 * MM gives us 02 for february
		 * MMM gives us "feb" for february
		 * MMMM gives us february
		 * YYYY is the year (YY) just gives us 18 
		 * hh gives us 12 hour clock
		 * HH gives us 24 hour clock
		 * mm gives us minutes
		 * ss gives us seconds
		 * SSS gives us nanoseconds (billion of a second)
		 * a gives us "am" or "pm"
		 * to put in text in your dateFormatter you use single quotes
		 * see 'day of year'
		 */
		DateTimeFormatter eurDateTime=DateTimeFormatter.
				ofPattern(" 'day of year 'D"
						+ " 'day of week' e dd EEEE MMMM YYYY HH:mm:ss:SS a");
		System.out.println(nowDateTime.format(eurDateTime));
		
		DateTimeFormatter eurDate1=DateTimeFormatter.ofPattern(
				"EEEE dd MMMM yyyy");
		//today is monday 12th february 2018
		System.out.println("today is "+today.format(eurDate1));
		
		DateTimeFormatter eurDate2=DateTimeFormatter.ofPattern("dd MM yyyy");
		//this will display 12 february 2018
		System.out.println("today simplier date "+today.format(eurDate2));
		
		LocalDate myDate=LocalDate.parse("01 01 2017",eurDate2);
		System.out.println("myDate is "+myDate);
		
		myDate=LocalDate.parse("Monday 12 February 2018",eurDate1);
		System.out.println(myDate);
		/*
		 * when using parse you have supply it with a formatter
		 */
				
	}
}
