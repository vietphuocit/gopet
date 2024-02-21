public class fh extends fz {
   public boolean a;
   public boolean b;
   public fy a;
   public boolean c;
   public boolean d;

   public fh() {
      this(0, 0, 0, 0);
   }

   public fh(int var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.a = true;
      this.c = false;
      this.d = false;
      this.l = true;
      this.x = 3;
   }

   public final void a(fh var1) {
      bc.a().a(this);
   }

   public final void a(boolean var1) {
      if (var1 && fs.a != null && !fs.a.d) {
         bc.a.v();
      }

      bc.a.a(this);
   }

   public final void b_() {
      fs var10000 = bc.a;
      fs.b(this);
   }

   protected void b() {
      super.b();
      gg.a(0, 0, this.t, this.u);
   }

   public void c() {
      gg.a(this);
   }

   public void e() {
      super.e();
      if (this.a && this.r >= bc.b) {
         this.b = true;
      }

   }

   public final boolean a(int var1, int var2) {
      super.a(var1, var2);
      return true;
   }

   public static void a(String var0, gq var1, gq var2, gq var3) {
      a(var0, var1, (gq)null, var3, false);
   }

   public static void a(String var0, gq var1, gq var2, gq var3, boolean var4) {
      (new fq(var0, var1, var2, var3, 0)).a(var4);
   }

   public static void b(String var0, gq var1, gq var2, gq var3, boolean var4) {
      (new fq(var0, (gq)null, var2, (gq)null, 1)).a(var4);
   }

   public static void a(String var0) {
      a(var0, false);
   }

   public static void a(String var0, boolean var1) {
      a(var0, (gq)null, gq.a, (gq)null, var1);
   }

   public static void i() {
      boolean var0 = true;
      String var10000 = gk.a(22);
      boolean var1 = true;
      String var2 = var10000;
      (new fq(var2, (gq)null, gq.b, (gq)null, 2)).a(var1);
   }

   public static void a(String var0, gq var1, gq var2) {
      a(var0, (gq)null, var1, var2, true);
   }

   public static void b(String var0) {
      String var10000 = var0;
      boolean var1 = true;
      b(var10000, (gq)null, gq.a, (gq)null, true);
   }

   public static void j() {
      if (fs.a != null && fs.a instanceof fq && ((fq)fs.a).a == 2) {
         fs.a.b_();
      }

   }

   public static fm a(String var0, gq var1, gq var2, int var3) {
      fm var4;
      (var4 = new fm(var0, var1, var2 == null ? gq.b : var2, 0)).a(true);
      return var4;
   }

   public final void k() {
      if (this.a) {
         this.v = bc.b;
      } else {
         this.b = true;
      }
   }
}
