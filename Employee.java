public class Employee {
    //todo;ここでは、参考サイトをもとに、toStringを試す！

        private String id;

        private String name;

        public Employee(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    @Override
    public String toString() {
        return "id=" + this.getId() + ", name=" + this.getName();
    }
}