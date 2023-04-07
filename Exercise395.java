
enum CommandList implements Command {
    RUN {
        public void execute() {
            System.out.println("Running...");
        }
    },
    JUMP {
        public void execute() {
            System.out.println("Jumping...");
        }
    };

    public abstract void execute();
}

interface Command {
    void execute();
}


public class Exercise395 {
    public static void main(String[] args) {
        for (Command cmd : CommandList.values()) {
            cmd.execute();
        }
    }
}
