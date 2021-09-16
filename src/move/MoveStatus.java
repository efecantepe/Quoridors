package move;

public enum MoveStatus {

    VALID{
        @Override
        public String toString() {
            return "Valid";
        }
    },

    INVALID{
        @Override
        public String toString() {
            return "Invalid";
        }
    };

    public abstract String toString();

}
