public abstract class Character {

        private String name;
        private int level;
        private int health;



        public final void moveSet() {
            attack();
            defend();
        }
        protected abstract void attack();
        protected abstract void defend();

        public String getName() {
        return name;
        }

        public void setName(String name) {
        this.name = name;
        }

        public int getLevel() {
        return level;
        }

        public void setLevel(int level) {
        this.level = level;
        }

        public int getHealth() {
        return health;
        }

        public void setHealth(int health) {
        this.health = health;
        }
}















