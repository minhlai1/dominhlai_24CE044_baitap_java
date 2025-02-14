public class Date {
        private int day;
        private int month;
        private int year;
    
        // Constructor
        public Date(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    
        // Getter cho day
        public int getDay() {
            return day;
        }
    
        // Setter cho day
        public void setDay(int day) {
            this.day = day;
        }
    
        // Getter cho month
        public int getMonth() {
            return month;
        }
    
        // Setter cho month
        public void setMonth(int month) {
            this.month = month;
        }
    
        // Getter cho year
        public int getYear() {
            return year;
        }
    
        // Setter cho year
        public void setYear(int year) {
            this.year = year;
        }
    
        // Phương thức setDate
        public void setDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    
        @Override
        public String toString() {
            return String.format("%02d/%02d/%04d", day, month, year);
        }
}
