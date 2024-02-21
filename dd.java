public final class dd extends fs {
   private fz a = new fz();
   private br a;
   ce a;
   private dg a;
   public int a;
   byte[] a;
   int[] a;
   int[] b;
   private String[] b;
   String[] a;
   public int b;
   private String a;

   public dd(br var1, int var2) {
      super(true);
      this.b = var2;
      this.e = true;
      this.a = v.c();
      this.a = var1;
      this.n = j.e;
      this.a = new dg(this.a);
      this.a.b(10 + (64 - this.a.t) / 2, 37);
      this.b.a(this.a);
      this.b.a(this.a);
      this.a.a(74, 42, bc.b - 64 - 20, 80);
      this.a.d(100, 100);
      this.a.j = true;
      this.a.c(1);
   }

   public final void a() {
      bc.a.setColor(0);
      bc.a.fillRect(0, 0, bc.b, bc.c);
      br.a.a(this.a.l);
      gg.b(10, 20, bc.b - 20, 22);
      br var10000 = this.a;
      br.a(this.a.b, this.a.a, bc.b >> 1, 22);
      gg.b(10, 42, 64, 80);
      gg.b(74, 42, bc.b - 20 - 64, 80);
      gg.b(10, 122, bc.b - 20, bc.c - 122 - 5 - gg.m);
      int var1 = 130;
      if (this.a != null) {
         gj.a.a(bc.a, this.a, 16, 130, 0);
         var1 = 130 + gj.a.a() + 4;
      }

      if (this.a != null) {
         for(int var2 = 0; var2 < this.a.length; ++var2) {
            gj.a.a(bc.a, this.a[var2], 16, var1, 0);
            var1 += gj.a.a();
         }
      }

   }

   public final void a(Object var1) {
      gq var2;
      int var4;
      switch((var2 = (gq)((Object[])var1)[0]).a) {
      case 10:
         var4 = this.a.c();
         int var6 = var4;
         var4 = this.a.a;
         ez var3;
         (var3 = new ez(81)).a(19);
         var3.b(var4);
         var3.a(var6);
         eu.a.a(var3);
         var3.a();
         j.e_();
         return;
      case 11:
         if ((var4 = this.a.c()) >= this.a.a.length) {
            j.e_();
            bf.c(-1);
            return;
         }

         gq var5 = new gq(12, "Học", new int[]{var4}, this);
         j.a("Bạn có chắc muốn thay thế chiêu thức cũ?", var5, j.b);
         return;
      case 12:
         var4 = ((int[])var2.a)[0];
         j.e_();
         bf.c(this.a.a[var4]);
         return;
      default:
         super.a(var1);
      }
   }

   public final void a(ce var1, int[] var2, int[] var3, byte[] var4, String[] var5, byte[] var6) {
      this.a = var1;
      this.a.a(var1);
      this.a = var2;
      this.b = var3;
      this.a = var6;
      this.b = var5;
      this.a = "(str)" + this.a.c + " (agi)" + this.a.d + " (int)" + this.a.e;
      this.a.m();

      for(int var7 = 0; var7 < 3; ++var7) {
         de var8;
         (var8 = new de(this, var7)).c(bc.b - 85 - 17, 20);
         var8.b(10, 5 + var7 * 25);
         this.a.a(var8);
         if (this.b == 0) {
            this.m = new gq(10, "Ok", this);
         } else {
            this.m = new gq(11, "Học chiêu thức", this);
         }
      }

      this.a((fy)this.a.a(this.a));
   }

   public final void a(ce var1) {
      this.a(var1, (int[])null, (int[])null, (byte[])null, (String[])null, (byte[])null);
   }

   public final void a(ez var1) {
      if (var1.a().readInt() == this.a.a) {
         this.a.c = var1.a().readInt();
         this.a.d = var1.a().readInt();
         this.a.e = var1.a().readInt();
         int[] var2 = new int[3];
         int[] var3 = new int[3];
         byte[] var4 = new byte[3];
         String[] var5 = new String[3];
         byte[] var6 = new byte[3];

         for(int var7 = 0; var7 < 3; ++var7) {
            var2[var7] = var1.a().readInt();
            var3[var7] = var1.a().readInt();
            var4[var7] = var1.a().readByte();
            var5[var7] = var1.a().readUTF();
            var6[var7] = var1.a().readByte();
         }

         this.a(this.a, var2, var3, var4, var5, var6);
         j.a("Luyện chỉ số thành công \n(str) " + this.a.c + "\n(agi) " + this.a.d + "\n(int) " + this.a.e, true);
         --this.a.l;
      }
   }

   static String a(dd var0) {
      return var0.b[var0.a];
   }
}
