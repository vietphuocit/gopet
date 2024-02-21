public final class be extends bg {
   final void a(bl var1) {
      byte var2 = var1.a;
      this.a(0, 0);
      int var3;
      switch(var1.b) {
      case 1:
         this.a.addElement(new bh(this, 0, var2, (Object)null));
      case 2:
      case 3:
      default:
         break;
      case 4:
         var3 = var1.a;
         this.a.addElement(new bh(this, 5, var2, new Integer(var3)));
      }

      var3 = var1.b.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var8 = var1.a[var4];
         int var5 = var1.b[var4];
         int var6 = var1.c[var4];
         int var7 = var1.d[var4];
         int[] var9;
         if (var5 < 0) {
            var9 = new int[]{var6, var7};
            this.a.addElement(new bh(this, 4, var8, var9));
         } else if (var5 >= 0 && var5 <= 2) {
            var9 = new int[]{var5, var6};
            this.a.addElement(new bh(this, 1, var8, var9));
         } else if (var5 >= 101 && var5 < 125) {
            var5 = var5 - 101 + 8;
            var9 = new int[]{var5, var6, var7};
            this.a.addElement(new bh(this, 6, var8, var9));
         } else if (var5 >= 125) {
            var9 = new int[]{var5, var6, var7};
            this.a.addElement(new bh(this, 11, var8, var9));
         }
      }

   }

   public final void a(boolean var1) {
      int var2 = var1 ? 1 : 0;
      String var3 = var1 ? "Nhận thưởng thắng cuộc." : "Nhận thưởng thua cuộc.";
      fq var4 = new fq(var3, (gq)null, new gq("Nhận", new bf(this)), gq.b, 0);
      this.a.addElement(new bh(this, 10, var2, var4));
      this.a.addElement(new bh(this, 7, var2, (Object)null));
   }
}
