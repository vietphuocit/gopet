import java.util.Vector;

final class cn extends ff {
   private final String a;
   private final String[] a;
   private int a;
   private final cl a;

   public cn(cl var1, String var2, String[] var3, int var4) {
      this.a = var1;
      this.a = var2;
      this.a = var4;
      Vector var8 = new Vector();

      int var5;
      for(var5 = 0; var5 < var3.length; ++var5) {
         String[] var6;
         (var6 = cl.a(var1).a(var3[var5], bc.b - 2 - 60))[0] = "- " + var6[0];

         for(int var7 = 0; var7 < var6.length; ++var7) {
            var8.addElement(var6[var7]);
         }
      }

      this.a = new String[var8.size()];

      for(var5 = 0; var5 < var8.size(); ++var5) {
         this.a[var5] = (String)var8.elementAt(var5);
      }

      this.c(bc.b - 4, this.a.length * (cl.a(var1).a() + 4) + 4);
      if (var4 == cl.a(var1)) {
         this.c = true;
      }

   }

   public final void a() {
      gg.b(0, 0, 50, 20);
      cl.a(this.a).a(bc.a, this.a, 2, 2, 0);
      int var1 = 0;

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         cl.a(this.a).a(bc.a, this.a[var2], 60, var1, 0);
         var1 += cl.a(this.a).a() + 4;
      }

   }

   public final void c() {
      if (this.a == cl.a(this.a)) {
         gf.a(bc.a, gg.j, gg.i, 1, 1, this.t - 2, this.u - 2, false);
      } else {
         bc.a.setColor(0);
         bc.a.fillRect(0, 0, this.t, this.u);
      }
   }
}
