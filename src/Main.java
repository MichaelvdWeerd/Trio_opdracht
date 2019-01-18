import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        SwingUtilities.invokeLater(ui);
    }
}

// SQL snippet
// String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=Netflix;integratedSecurity=true";
//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//Connection conn = DriverManager.getConnection(url);