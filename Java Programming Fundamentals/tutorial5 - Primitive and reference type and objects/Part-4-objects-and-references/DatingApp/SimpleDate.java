public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
            this.day < compared.day) {
            return true;
        }

        return false;
    }
    public void advance() {
        final int LIMIT_DAY = 30;
        final int LIMIT_MONTH = 12;
        this.day ++;
        if (this.day > LIMIT_DAY) {
            this.day = 1;
            this.month ++;
            if (this.month > LIMIT_MONTH) {
                this.month = 1;
                this.year ++;
            }
        }
    }
    public void advance(int howManyDays) {
        for (int i = 0; i < howManyDays; i ++) {
            this.advance();
        }
    }
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }
}
