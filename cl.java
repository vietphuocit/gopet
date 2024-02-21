import java.util.Vector;

public final class cl extends fs {
   private final Vector a;
   private final fl b;
   private int a;

   public cl(Vector var1, int var2) {
      super(true);
      this.b = gj.a;
      String var4 = "Báo danh nhận thưởng";
      super.d = var4;
      this.a = var1;
      cl var7 = this;
      fz var3;
      (var3 = new fz(0, gg.l, bc.b, bc.c - 2 * gg.l)).j = true;
      var3.l = true;
      int var8 = 0;

      for(int var5 = 0; var5 < var7.a.size(); ++var5) {
         ei var6 = (ei)var7.a.elementAt(var5);
         cn var9;
         (var9 = new cn(var7, var6.a, var6.a, var5)).b(2, var8);
         var3.a(var9);
         var8 += var9.u;
      }

      var7.b.a(var3);
      var3.c(1);
      var3.c(true);
      this.n = j.e;
      this.m = new gq(0, "Nhận", new cm(this));
      this.a = var2;
   }

   public final void a() {
      bc.a.setColor(0);
      bc.a.fillRect(0, 0, bc.b, bc.c);
   }

   static fl a(cl var0) {
      return var0.b;
   }

   static int a(cl var0) {
      return var0.a;
   }
}
