package homework.educationwithcollectins.education.model;


import java.io.Serializable;

public  class Lesson implements Serializable,Comparable {
        private String name;
        private String duration;
        private String lecturerName;
        private int  price;

        public Lesson(String name, String duration, String lecturerName, int price) {
            this.name = name;
            this.duration = duration;
            this.lecturerName = lecturerName;
            this.price = price;
        }
        public Lesson(){}


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getLecturerName() {
            return lecturerName;
        }

        public void setLecturerName(String lecturerName) {
            this.lecturerName = lecturerName;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Lesson{" +
                    "name='" + name + '\'' +
                    ", duration='" + duration + '\'' +
                    ", lecturerName='" + lecturerName + '\'' +
                    ", price=" + price +
                    '}';
        }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

