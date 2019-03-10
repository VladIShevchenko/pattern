public class Human {
    private final String name;
    private final int yearOfBirth;
    private final int hairColor;
    private final int height;
    private final int weight;
    private final boolean haveChildr;

    public Human(Builder builder) {
        name = builder.name;
        yearOfBirth = builder.yearOfBirth;
        hairColor = builder.hairColor;
        height = builder.height;
        weight = builder.weight;
        haveChildr = builder.haveChildr;
    }
    public static class Builder {
        private final String name;
        private final int yearOfBirth;
        private int hairColor = 000000;
        private int height = 0;
        private int weight = 0;
        private boolean haveChildr = false;


        public Builder(String name, int yearOfBirth) {
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        }

        public Builder hairColor(int value) {
            hairColor = value;
            return this;
        }

        public Builder height(int value) {
            height = value;
            return this;
        }

        public Builder weight(int value) {
            weight = value;
            return this;
        }

        public Builder haveChildr(boolean value) {
            haveChildr = value;
            return this;
        }

        public Human build() {
            return new Human(this);
        }

    }
}
