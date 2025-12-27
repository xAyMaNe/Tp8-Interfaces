package ex2;

public class Main {
    public static void main(String[] args) {
        // Créer le gestionnaire de notifications
        NotificationManager manager = new NotificationManager();
        
        // Enregistrer les différents canaux
        manager.addChannel(new EmailNotification("system@company.com"));
        manager.addChannel(new SMSNotification("+33123456789"));
        manager.addChannel(new PushNotification("com.app.notifications"));
        
        // Diffuser plusieurs messages à différents destinataires
        System.out.println("=== Premier broadcast ===");
        manager.broadcast("user@example.com", "Bienvenue sur notre plateforme!");
        
        System.out.println("=== Deuxième broadcast ===");
        manager.broadcast("0612345678", "Votre commande #123 a été expédiée.");
        
        System.out.println("=== Troisième broadcast ===");
        manager.broadcast("john.doe@mobile", "Urgent: Action requise sur votre compte.");
    }
}