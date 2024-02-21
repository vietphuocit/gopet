import java.util.Hashtable;
import javax.microedition.lcdui.Image;

public final class eg implements go {
   public static ds a;
   public static ea a;
   public Image[] a;
   public Image a;
   private final Hashtable a = new Hashtable();

   public final dv a(int var1) {
      Integer var2 = new Integer(var1);
      return (dv)this.a.get(var2);
   }

   public static ds a(int var0) {
      ds var1 = null;
      if (a != null) {
         var1 = a.a.a(var0);
      }

      return var1;
   }

   public final void a(int var1) {
      if (a != null) {
         ds var2;
         if ((var2 = a(var1)) != null && var2.a) {
            a.a(var2);
            var2.a(a);
         }

      }
   }

   public final void a(int var1, String var2) {
      if (a != null && var2 != null) {
         ds var3;
         if ((var3 = a(var1)) != null && var3.a) {
            var3.b(var2);
         }

      }
   }

   public final void a(Object var1) {
      switch(((gq)((Object[])var1)[0]).a) {
      case 101:
         (new ah()).a(1, true);
         return;
      case 900:
         ds var2;
         int var10000 = (var2 = a.a).a;
         String var3 = var2.d;
         au.a(var2.b, 0);
         a.l();
      default:
         return;
      case 1103:
         j.e_();
         eu.c(a.c);
         return;
      case 1204:
         a(a.a, new fy[]{new fn(c.a(574)), new ff(new gq(1202, c.a(134), this)), new ff(new gq(1203, c.a(471), this))});
         return;
      case 2020:
         (new ah()).a(1, true);
      }
   }

   public static void a(int var0, int var1, int var2) {
      j.e_();
      eu.b(var0, var1, var2);
   }

   public static void a() {
      if (a != null && a.a != null) {
         a.a.a((Object)null);
      }

      (new av(1)).d(0);

      try {
         Thread.sleep(50L);
      } catch (InterruptedException var0) {
      }

      b();
   }

   public final ea a(ea var1, ed var2, int var3, int var4, int var5) {
      var1.c = var3;
      var1.a(var2);

      for(int var7 = 0; var7 < 4; ++var7) {
         dw var6;
         (var6 = new dw()).m = au.b(var1.a.c);
         var6.n = au.b(var1.a.d);
         var6.c = var6.m;
         var6.d = var6.n;
         var6.a = var1.a.c;
         var6.b = var1.a.d;
         var1.a((dz)var6);
         var1.c(var6);
      }

      var1.a(a, var4, var5, true);
      var1.b(a.a() ? 0 : 1);
      var1.a.b = var1.a.a;
      var1.b.b = var1.b.a;
      var1.p();
      return var1;
   }

   public static void a(dz var0, fy[] var1) {
      i var2 = j.a(var1);
      if (var0 instanceof ds) {
         var2.a(var0.m - a.a.b, var0.n - 54 - a.b.b);
      } else {
         var2.a(var0.m - a.a.b, var0.n - a.b.b);
      }

      var2.a(true, -1, 1);
      bc.a.a(var2, false);
   }

   public static void b() {
      if (br.a != null) {
         br.a.a.clear();
      }

      v.d();
      v.c();
      a = null;
      System.gc();
   }
}
