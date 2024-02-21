import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class fa {
   public ey a;
   public DataOutputStream a;
   public DataInputStream a;
   private SocketConnection a;
   public boolean a;
   private fd a;
   private fc a;
   public int a;
   public int b;
   public fe a;
   public String a;
   public int c;
   public boolean b = true;

   public final boolean a() {
      return this.a;
   }

   public final void a(ey var1) {
      this.a = var1;
   }

   public final void a(fc var1) {
      this.a = var1;
   }

   public final void a(fd var1) {
      this.a = var1;
   }

   public final void a(String var1, int var2) {
      (new Thread(new fb(this, var1, var2))).start();
   }

   public final void a(ez var1) {
      this.a.a(var1);
   }

   public final void a() {
      this.a.a();
   }

   public final void b() {
      try {
         this.a = null;
         this.c = -1;
         this.a = false;
         if (this.a != null) {
            this.a.a();
         }

         if (this.a != null) {
            this.a.close();
            this.a = null;
         }

         if (this.a != null) {
            this.a.close();
            this.a = null;
         }

         if (this.a != null) {
            this.a.close();
            this.a = null;
         }

         this.a = 0;
         this.b = 0;
      } catch (Exception var1) {
      }
   }

   static void a(fa var0, String var1, int var2) {
      (var0 = var0).a = (SocketConnection)Connector.open("socket://" + var1 + ":" + var2);
      var0.a = var0.a.openDataOutputStream();
      var0.a = var0.a.openDataInputStream();
      long var6 = System.currentTimeMillis();
      var0.a.a(var6);
      var0.a = new fe(var6);
      var0.a = true;
      (new Thread(var0.a)).start();
      (new Thread(var0.a)).start();
      var0.a = var1;
      var0.c = var2;
   }
}
