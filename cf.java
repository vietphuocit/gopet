public final class cf extends fh {
   public cf() {
      super(bc.b - 171 >> 1, bc.c - 64 - gg.m - 10, 171, 64);
      this.e = j.b;
   }

   public final void a(int[] var1, String[] var2, String[] var3, int[] var4, gq[] var5) {
      for(int var6 = 0; var6 < var2.length; ++var6) {
         dk var7;
         (var7 = new dk(var1[var6], var2[var6], var3[var6], var4[var6])).c(this.t - 8, 20);
         var7.b(17, var6 * 20);
         this.a(var7, false);
         var7.d = var5[var6];
      }

   }

   public final void c() {
      int var10000 = bc.b;
      var10000 = bc.c;
      bc.a.setColor(16579281);
      bc.a.fillRect(0, 0, this.t, this.u);
      bc.a.setColor(3872520);
      bc.a.drawRect(0, 0, this.t - 1, this.u - 1);
   }
}
