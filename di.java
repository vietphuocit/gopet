import javax.microedition.lcdui.Graphics;

final class di extends fh {
   private final dh a;

   public di(dh var1, int var2, String var3, String[] var4, byte[] var5, gq var6, gq var7, gq var8) {
      this.a = var1;
      if (var6 != null) {
         this.c = var6;
      }

      if (var8 != null) {
         this.e = var8;
      }

      if (var7 != null) {
         this.d = var7;
      }

      int var12 = bc.b - (gg.p << 2);
      this.x = this.y = 2;
      this.c = 0;
      fn var13;
      (var13 = new fn(var3, v.d)).q = 17;
      this.a(var13, false);
      ao var14 = new ao();
      this.a(var14, false);
      int var15 = 0;
      int var16 = (gg.m << 1) + (gg.p << 2);
      if (var4 != null) {
         var16 = ((var4.length << 1) + 2) * gg.m;
         this.a(bc.d - (var12 >> 1), bc.e - (var16 >> 1), var12, var16);

         for(int var17 = 0; var17 < var4.length; ++var17) {
            String[] var19 = v.d.a(var4[var17], var12 - (gg.p << 1));
            fn var9;
            (var9 = new fn(var19[0], v.d)).q = 20;
            this.a(var9, false);

            for(int var20 = 1; var20 < var19.length; ++var20) {
               fn var10;
               (var10 = new fn(var19[var20], v.d)).q = 20;
               this.a(var10, false);
               ++var15;
            }

            fi var21;
            (var21 = new fi()).a(gg.p << 2, 0, this.t - (gg.p << 2), gg.m);
            byte var22 = 1;
            if (var5[var17] == 0) {
               var22 = 0;
            }

            var21.a(var22);
            this.a(var21, false);
         }
      } else {
         fi var18;
         (var18 = new fi()).a(gg.p << 2, 0, var12 - (gg.p << 2), gg.m);
         var18.a(var5[0]);
         this.a(var18, false);
         if (this.d != null) {
            this.d.a = var18;
         }
      }

      this.a(bc.d - (var12 >> 1), bc.e - (var16 >> 1), var12, var16);
      this.c(1);
      var14.t = bc.g;
      var14.v = var14.r = bc.f >> 1;
      this.u += var15 * gg.m;
      this.j = true;
      this.l = true;
   }

   public final void c() {
      Graphics var4 = bc.a;
      int var3 = this.u;
      int var2 = this.t;
      boolean var1 = true;
      var1 = true;
      di var5 = this;
      bc.a.setColor(14473688);
      au.b(2, 2, var2 - 4, var3 - 4, var4);
      var3 = dh.a(this.a).getWidth();
      var2 = var2 / var3 + 1;

      for(int var6 = 0; var6 < var2; ++var6) {
         bc.a.drawImage(dh.a(var5.a), 2 + var3 * var6, 2, 0);
      }

   }
}
