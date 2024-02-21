import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

public final class eu {
   public static fa a;
   public static String a;
   public static go a;
   public static go b;
   public static int a = 19180;
   public static String b = "14.225.207.158";
   public static String c = "14.225.207.158";
   public static int b = 19180;
   private static byte a = 0;
   public static int c = 0;
   public static String d = "http://ip.qmobi.net/gopetServer.txt";
   public static String e = "http://ip.qmobi.net/help_mgo.txt";
   public static String f = "http://mgo.vn/index.php/staticpage/legal";
   public static Vector a = new Vector();

   public static boolean a() {
      return a != null && a.a() && c.equals(a.a) && b == a.c;
   }

   public static void a(String var0) {
      ez var1;
      (var1 = new ez(9)).a(var0);
      a.a(var1);
   }

   public static void a() {
      b();
      bc.a.a = new fa();
      (a = bc.a.a).a((ey)en.a());
      a.a(new fc(a));
      a.a(new fd(a));
      a.a(c, b);
   }

   public static void b() {
      if (a != null) {
         a.b();
         a.a = null;
         a = null;
      }

   }

   public static void c() {
      ez var0;
      (var0 = new ez(-36, true)).a(0);
      var0.b(c);
      var0.a(j.b());
      var0.a(System.getProperty("microedition.platform") + ";" + System.getProperty("microedition.configuration") + ";" + System.getProperty("microedition.profiles") + ";" + System.getProperty("microedition.hostname") + ";gopet");
      var0.b(bc.b);
      var0.b(bc.c);
      var0.a("vi");
      var0.a("2.4.9");
      a.a(var0);
   }

   public static void a(String var0, String var1, String var2) {
      ez var3;
      (var3 = new ez(1, true)).a(var0);
      var3.a(var1);
      var3.a(bc.a.a.getAppProperty("RefCode"));
      var3.a(var2);
      var0 = j.g();
      var1 = j.e();
      var2 = j.f();
      String var4 = j.d();
      String var5 = j.h();
      var3.a(var0);
      var3.a(var1);
      var3.a(var2);
      var3.a(var4);
      if (var5 != null) {
         var3.a(var5);
      }

      a.a(var3);
      var3.a();
   }

   public static void a(String var0, String var1) {
      ez var2;
      (var2 = new ez(35, true)).a(var0);
      var2.a(var1);
      a.a(var2);
      var2.a();
   }

   public static void a(String var0, String var1, go var2, go var3) {
      (new Thread(new ev(var1, var0, var2, var3))).start();
   }

   public static void b(String var0, String var1) {
      ez var2;
      (var2 = new ez(57)).a(var0);
      var2.a(var1);
      a.a(var2);
   }

   public static void a(int var0) {
      ez var1;
      (var1 = new ez(73)).a(1);
      a.a(var1);
   }

   public static void b(int var0) {
      ez var1;
      (var1 = new ez(72)).a(var0);
      a.a(var1);
   }

   public static void a(String var0, go var1, go var2) {
      HttpConnection var3 = null;

      label96: {
         try {
            (var3 = (HttpConnection)Connector.open(var0)).setRequestMethod("GET");
            var3.setRequestProperty("Content-Type", "//text plain");
            var3.setRequestProperty("Connection", "close");
            if (var3.getResponseCode() != 200) {
               break label96;
            }

            InputStream var14 = var3.openInputStream();
            int var4;
            if ((var4 = (int)var3.getLength()) == -1) {
               break label96;
            }

            byte[] var15 = new byte[var4];
            var14.read(var15);
            var0 = new String(var15, "UTF-8");
            if (var1 == null) {
               break label96;
            }

            var1.a(var0);
         } catch (IOException var12) {
            break label96;
         } finally {
            try {
               if (var3 != null) {
                  var3.close();
               }
            } catch (IOException var11) {
            }

         }

         return;
      }

      var2.a((Object)null);
   }

   public static void a(int var0, int[] var1) {
      ez var3 = new ez(24);

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var3.b(var1[var2]);
      }

      a.a(var3);
      var3.a();
   }

   public static void a(int var0, byte var1, int var2) {
      ez var3;
      (var3 = new ez(81)).a(44);
      var3.b(var2);
      a.a(var3);
      var3.a();
   }

   public static void a(int var0, int var1, int var2) {
      ez var3;
      (var3 = new ez(79)).b(var1);
      var3.b(var2);
      a.a(var3);
      var3.a();
   }

   public static void a(int var0, int var1, int var2, String[] var3) {
      ez var4;
      (var4 = new ez(var0)).a(var1);
      var4.b(var2);
      var1 = var3.length;
      var4.b(var1);

      for(var2 = 0; var2 < var1; ++var2) {
         var4.a(var3[var2]);
      }

      a.a(var4);
      var4.a();
   }

   public static void a(String var0, byte var1) {
      ez var2;
      (var2 = new ez(96)).a(0);
      var2.a(var1);
      var2.a(var0);
      a.a(var2);
      var2.a();
   }

   public static void a(String var0, int var1) {
      ez var2;
      (var2 = new ez(21)).a(var0);
      var2.a((byte)var1);
      a.a(var2);
      var2.a();
   }

   private static void e(int var0) {
      ez var1 = new ez(var0);
      a.a(var1);
      var1.a();
   }

   public static void c(String var0, String var1) {
      ez var2;
      (var2 = new ez(93)).a(2);
      var2.a(7);
      var2.a(var0);
      var2.a(var1);
      a.a(var2);
      var2.a();
   }

   public static void a(int var0, int var1, byte var2, int[] var3) {
      if (a != null) {
         ez var4;
         (var4 = new ez(27)).b(var1);
         var4.a(var2);
         var4.b(var0);
         var4.b(var3.length);

         for(var0 = 0; var0 < var3.length; ++var0) {
            var4.b(var3[var0]);
         }

         if (a != null) {
            a.a(var4);
         }

         var4.a();
      }
   }

   public static void b(int var0, int var1, int var2) {
      ez var3;
      (var3 = new ez(25)).b(var0);
      var3.b(var1);
      var3.b(var2);
      a.a(var3);
      var3.a();
   }

   public static void c(int var0) {
      ez var1;
      (var1 = new ez(7)).b(var0);
      a.a(var1);
      var1.a();
   }

   public static void b(String var0) {
      ez var1;
      (var1 = new ez(101)).a(var0);
      a.a(var1);
      var1.a();
   }

   public static void d() {
      e(44);
   }

   public static void a(g var0, String var1, String var2) {
      ez var3;
      (var3 = new ez(71, true)).a(var0.b);
      var3.a(var0.a);
      var3.a(var1);
      if (var2 != null) {
         var3.a(var2);
      }

      var3.a(bc.a.a.getAppProperty("RefCode"));
      a.a(var3);
   }

   public static void e() {
      if (a()) {
         b();
         eg var10000 = en.a.a;
         eg.a();
         (new z()).d(0);
         gf.a();
         eg.a = null;
         en.d();
         a = null;
      }

   }

   public static void a(go var0, go var1) {
      (new Thread(new ew(var0, (go)null))).start();
   }

   public static void c(String var0) {
      a.removeAllElements();
      if (var0.indexOf(";") == -1 && var0.length() > 0) {
         a.addElement(a(var0));
      } else {
         while(var0.indexOf(";") != -1) {
            String var1 = var0.substring(0, var0.indexOf(";"));
            a.addElement(a(var1));
            if ((var0 = var0.substring(var0.indexOf(";") + 1)).indexOf(";") == -1 && var0.length() > 0) {
               a.addElement(a(var0));
            }
         }

      }
   }

   private static ap a(String var0) {
      String var1 = var0.substring(0, var0.indexOf("|"));
      String var2 = (var0 = var0.substring(var0.indexOf("|") + 1)).substring(0, var0.indexOf(":"));
      int var3 = Integer.parseInt(var0.substring(var0.indexOf(":") + 1).trim());
      return new ap(var1, var2, var3, 0, 0);
   }

   public static void d(int var0) {
      ez var1;
      (var1 = new ez(122)).a(2);
      var1.b(var0);
      a.a(var1);
      var1.a();
   }

   static void a(int var0, boolean var1) {
      ez var2;
      (var2 = new ez(45)).a(4);
      var2.b(var0);
      var2.a(var1);
      a.a(var2);
      var2.a();
   }

   public static void f() {
      e(64);
   }

   public static void a(int var0, int var1) {
      ez var2;
      (var2 = new ez(122)).a(5);
      var2.b(var0);
      var2.b(var1);
      a.a(var2);
      var2.a();
   }

   public static void b(int var0, int var1) {
      ez var2;
      (var2 = new ez(122)).a(3);
      var2.b(var0);
      var2.b(var1);
      a.a(var2);
      var2.a();
   }

   public static void c(int var0, int var1) {
      ez var2;
      (var2 = new ez(125)).a(1);
      var2.b(var0);
      var2.a(var1);
      a.a(var2);
      var2.a();
   }

   public static void g() {
      ez var0;
      (var0 = new ez(125)).a(2);
      a.a(var0);
      var0.a();
   }

   public static void h() {
      ez var0;
      (var0 = new ez(42)).a(12);
      a.a(var0);
      var0.a();
   }
}
