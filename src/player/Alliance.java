package player;

public enum Alliance {

    WHITE{
        @Override
        public String toString() {
            return "White";
        }
    },

    BLACK{
        @Override
        public String toString() {
            return "Black";
        }
    };

    public abstract String toString();
}
