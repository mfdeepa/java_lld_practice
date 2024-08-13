package practiceDesignPattern.pen2.model;

public class Ink {
        private String color;
        private int quantity;
        private InkType type;

        public Ink(String color, int quantity, InkType inkType) {
                this.color = color;
                this.quantity = quantity;
                this.type = inkType;
        }
}
