package player;

public enum Alliance {

    WHITE{
        @Override
        public String toString() {
            return "White";
        }

        @Override
        public Alliance getOpposite() {
            return Alliance.BLACK;
        }

        @Override
        public Alliance getAlliance() {
            return Alliance.WHITE;
        }
    },

    BLACK{
        @Override
        public String toString() {
            return "Black";
        }

        @Override
        public Alliance getOpposite() {
            return Alliance.WHITE;
        }

        @Override
        public Alliance getAlliance() {
            return Alliance.BLACK;
        }
    };

    public abstract String toString();
    public abstract Alliance getOpposite();
    public abstract Alliance getAlliance();
}
