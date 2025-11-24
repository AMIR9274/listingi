public class DatePart {

    private Date fromDate = null;
    private SimpleDateFormat formatter= null;

    public DatePart(Date anyDate) {
        fromDate = anyDate;
        formatter = new SimpleDateFormat("EEE MMM dd hh:mm:ss yyyy",
                Locale.getDefault());
    }

    public int getDay() {
        formatter.applyPattern("d");
        return Integer.parseint(formatter.format(fromDate));
    }

    public int getMonth() {
        formatter.applyPattern("M");
        return Integer.parseint(formatter.format(fromDate));
    }

    public int get Year() {
        formatter.applyPattern("y");
        return Integer.parseint(formatter.format(fromDate));
    }

    public int getHour()• {
        formatter.applyPattern("h");
        return Integer.parseint(formatter.format(fromDate));
    }

    public int getMinute() { formatter.applyPattern("m");
        return Integer.parseint(formatter.format(fromDate));
    }

}