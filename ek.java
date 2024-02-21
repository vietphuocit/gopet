import javax.microedition.io.ConnectionNotFoundException;

public final class ek implements go {
   public final void a() {
      fh.a(c.a(82), new gq(1, c.a(580), this), (gq)null, j.b, true);
   }

   static void b() {
      av.h();
      if (en.a.a != null) {
         eg var10000 = en.a.a;
         eg.a();
      }

      (new z()).d(0);

      try {
         Thread.sleep(100L);
      } catch (InterruptedException var0) {
      }

      gf.a();
      eg.a = null;
      en.d();
      eu.a = null;
   }

   public final void a(String var1, String var2) {
      j.a = var2;
      fh.a(var1, new gq(48, c.a(116), this), (gq)null, j.b);
      fs.a.c = true;
   }

   public final void a(Object var1) {
      gq var4;
      switch((var4 = (gq)((Object[])var1)[0]).a) {
      case 1:
         j.a(true);
         (new Thread(new el(this))).start();
         return;
      case 2:
         String var5 = (String)var4.a;

         try {
            bc.a.a.platformRequest(var5);
            return;
         } catch (ConnectionNotFoundException var3) {
            return;
         }
      case 48:
         try {
            bc.a().v();
            bc.a.a.platformRequest(j.a);
            return;
         } catch (ConnectionNotFoundException var2) {
            return;
         }
      default:
      }
   }
}
