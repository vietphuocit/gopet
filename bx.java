import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class bx extends ea {
   private br a;
   private ec a;
   private ec b;
   private ec c;
   private ec d;
   private ec e;
   private ec f;
   private ec g;
   private ec h;
   private ec i;
   private ec j;
   private ec k;
   private ec l;
   private ec m;
   private ec n;
   private ec o;
   private ec p;
   public gb a;
   public gb b;
   public gb c;
   public Vector a = new Vector();
   public Hashtable a;
   private da a;
   private da b;
   private da c;
   private fz a;
   private gq b;
   private gq c;
   public int a;
   public int b;
   public static Image a;
   private boolean f = false;
   private int d;
   private long a;

   public bx(eg var1) {
      super(var1);
      this.d = true;
      this.a = (br)en.a().a;
      this.a = new Hashtable();
      if (a == null) {
         try {
            a = Image.createImage("/pet/button/heal.png");
            return;
         } catch (IOException var2) {
            var2.printStackTrace();
         }
      }

   }

   public final bg a(int var1) {
      return (bg)this.a.get(new Integer(var1));
   }

   public final bp a(int var1) {
      for(int var3 = 0; var3 < this.a.size(); ++var3) {
         bp var2;
         if ((var2 = (bp)this.a.elementAt(var3)).a == var1) {
            return var2;
         }
      }

      return null;
   }

   public final void h_() {
      super.h_();
      Enumeration var1 = this.a.elements();

      while(var1.hasMoreElements()) {
         bg var2;
         (var2 = (bg)var1.nextElement()).a();
         if (var2.b) {
            this.a.remove(new Integer(var2.a[0]));
         }
      }

      long var3 = System.currentTimeMillis();
      if (this.f && var3 - this.a >= (long)(this.d * 1000)) {
         this.f = false;
      }

   }

   protected final void h() {
      this.b.b(this.a);
      this.l = this.b;
      this.n = this.c;
   }

   protected final void i() {
      Vector var1;
      (var1 = new Vector()).addElement(new gq(335, "Cánh của tôi", this));
      var1.addElement(new gq(336, "Chat bang hội", this));
      var1.addElement(new gq(331, "Chat cộng đồng", this));
      var1.addElement(new gq(330, "Tủ quần áo", this));
      gq var2 = new gq(317, "Chọn pet", this);
      var1.addElement(var2);
      var1.addElement(new gq(327, "Đổi mật khẩu", this));
      var1.addElement(new gq(0, c.a(267), this));
      var1.addElement(new gq(10000, c.a(139), this));
      this.a(var1, 0);
   }

   public final void a(Object var1) {
      gq var2;
      int var7;
      ez var8;
      ez var9;
      ds var10000;
      boolean var19;
      cb var21;
      switch((var2 = (gq)((Object[])var1)[0]).a) {
      case 305:
         if (this.d == null) {
            try {
               Image var23 = Image.createImage("/pet/button/play.png");
               this.d = new ec(this, var23, new gq(307, "Chơi với pet", this));
               Image var17 = Image.createImage("/pet/button/kiss.png");
               this.e = new ec(this, var17, new gq(308, "Hôn pet", this));
               Image var25 = Image.createImage("/pet/button/puke.png");
               this.f = new ec(this, var25, new gq(309, "Xoa đầu pet", this));
            } catch (IOException var6) {
               var6.printStackTrace();
            }
         }

         ec[] var24 = new ec[]{this.d, this.e, this.f};
         this.s();
         this.a((ec[])var24);
         return;
      case 306:
      case 316:
      case 329:
      default:
         super.a(var1);
         break;
      case 307:
         bf.a(1);
         var10000 = eg.a;
         if (((bq)eg.a).a != null) {
            var21 = new cb(this, this, 1, eg.a);
            this.b.addElement(var21);
         }

         this.s();
         return;
      case 308:
         bf.a(0);
         var10000 = eg.a;
         if (((bq)eg.a).a != null) {
            var21 = new cb(this, this, 0, eg.a);
            this.b.addElement(var21);
         }

         this.s();
         return;
      case 309:
         bf.a(2);
         var10000 = eg.a;
         if (((bq)eg.a).a != null) {
            var21 = new cb(this, this, 2, eg.a);
            this.b.addElement(var21);
         }

         this.s();
         return;
      case 310:
         br.a = 0;
         this.s();
         bf.b(1);
         j.e_();
         return;
      case 311:
         this.s();
         j.e_();
         (var8 = new ez(81)).a(28);
         eu.a.a(var8);
         var8.a();
         return;
      case 312:
         this.s();
         (var8 = new ez(81)).a(30);
         eu.a.a(var8);
         var8.a();
         return;
      case 313:
         this.s();
         if (this.a != null) {
            bn var22;
            if ((var22 = ((bq)this.a).a) == null) {
               j.a_("Người chơi này không mang theo pet.");
               return;
            }

            var2 = new gq(314, "Có", new Integer(this.a.a), this);
            gq var15 = new gq(315, "Không", this);
            j.a("Bạn muốn thách đấu với " + var22.d + ", cấp " + var22.c + "?", var2, var15);
            return;
         }
         break;
      case 314:
         var7 = (Integer)var2.a;
         (var9 = new ez(81)).a(12);
         var9.b(var7);
         eu.a.a(var9);
         var9.a();
      case 315:
         fs.b(fs.a);
         return;
      case 317:
         j.e_();
         (var8 = new ez(81)).a(5);
         eu.a.a(var8);
         var8.a();
         return;
      case 318:
         if (this.a != 1) {
            this.a = 1;
            var19 = false;
            (var9 = new ez(81)).a(37);
            var9.a(1);
            eu.a.a(var9);
            var9.a();
            return;
         }
         break;
      case 319:
         if (this.a != 2) {
            this.a = 2;
            var19 = false;
            (var9 = new ez(81)).a(37);
            var9.a(2);
            eu.a.a(var9);
            var9.a();
            return;
         }
         break;
      case 320:
         bx var20 = this;
         ce var18;
         if ((var18 = this.a(eg.a.a).a[0].a).b.length != 0) {
            cf var12 = new cf();
            gq[] var4 = new gq[var18.b.length];

            for(int var5 = 0; var5 < var18.a.length; ++var5) {
               var4[var5] = new gq(322, "Ok", new Integer(var18.a[var5]), var20);
            }

            var12.a(var18.a, var18.a, var18.b, var18.b, var4);
            var12.a(true);
            return;
         }

         j.c("Chưa có kĩ năng nào.");
         break;
      case 321:
         if (this.a != 3) {
            this.a = 3;
            var19 = false;
            (var9 = new ez(81)).a(37);
            var9.a(3);
            var9.b(0);
            eu.a.a(var9);
            var9.a();
            return;
         }
         break;
      case 322:
         var7 = (Integer)var2.a;
         if (this.a != 4 && this.b != var7) {
            this.a = 4;
            this.b = var7;
            boolean var14 = false;
            (var9 = new ez(81)).a(37);
            var9.a(4);
            var9.b(var7);
            eu.a.a(var9);
            var9.a();
         }

         this.w();
         return;
      case 323:
         this.s();
         ((bq)eg.a).a.a = true;
         bf.a(true);
         eg.a.d = true;
         return;
      case 324:
         j.e_();
         (var8 = new ez(81)).a(54);
         eu.a.a(var8);
         var8.a();
         return;
      case 325:
         br.a = 0;
         this.s();
         if (this.a != null) {
            bf.b(this.a.a, 0);
            j.e_();
            return;
         }
         break;
      case 326:
         this.s();
         if (this.a != null) {
            j.e_();
            bf.b(this.a.a, 1);
            return;
         }
         break;
      case 327:
         String[] var16 = new String[]{"Mật khẩu hiện tại", "Mật khẩu mới", "Nhập lại"};
         int[] var11 = new int[]{2, 2, 2};
         j.a("Đổi Mật Khẩu", var16, var11, new gq(328, "Đổi", this), j.b);
         return;
      case 328:
         fm var13;
         String var10 = (var13 = (fm)fs.a).a(0);
         String var3 = var13.a(1);
         if (var13.a(2).equals(var3) && !"".equals(var3)) {
            this.w();
            j.e_();
            eu.c(var10, var3);
            return;
         }

         j.a_("Mật khẩu nhập không đúng, vui lòng nhập lại");
         return;
      case 330:
         j.e_();
         (var8 = new ez(81)).a(62);
         eu.a.a(var8);
         var8.a();
         return;
      case 331:
         (new dh()).j_();
         return;
      case 332:
         j.e_();
         (var8 = new ez(81)).a(90);
         var8.a(1);
         eu.a.a(var8);
         var8.a();
         this.s();
         return;
      case 333:
         this.s();
         if (this.a != null) {
            j.e_();
            var7 = this.a.a;
            (var9 = new ez(81)).a(91);
            var9.a(17);
            var9.b(var7);
            eu.a.a(var9);
            var9.a();
            return;
         }
         break;
      case 334:
         j.e_();
         (var8 = new ez(81)).a(92);
         var8.a(1);
         eu.a.a(var8);
         var8.a();
         return;
      case 335:
         j.e_();
         (var8 = new ez(81)).a(92);
         var8.a(2);
         eu.a.a(var8);
         var8.a();
         return;
      case 336:
         j.e_();
         (var8 = new ez(81)).a(91);
         var8.a(20);
         eu.a.a(var8);
         var8.a();
         return;
      case 337:
         this.s();
         if (this.a != null) {
            j.e_();
            var7 = this.a.a;
            (var9 = new ez(81)).a(96);
            var9.b(var7);
            eu.a.a(var9);
            var9.a();
            return;
         }
         break;
      case 338:
         this.s();
         j.e_();
         bf.h(j.a.d);
         return;
      case 339:
         this.s();
         if (this.a != null) {
            j.e_();
            bf.h(this.a.a);
            return;
         }
      }

   }

   protected final void j() {
      bv var1 = br.a;
      v.c().a(bc.a, br.a, 20, 2, 0);
      bc.a.drawRegion(v.e, bv.a * 14, 0, 14, 14, 0, 2, 2, 0);
      v.c().a(bc.a, br.b, 20, 16, 0);
      bc.a.drawImage(var1.a.a, 2, 18, 0);
      long var3;
      if ((var3 = System.currentTimeMillis()) - bv.a > 100L) {
         bv.a = (bv.a + 1) % 5;
         bv.a = var3;
      }

      if (br.c != 0L) {
         v.c().a(bc.a, br.c, 20, 34, 0);
         bc.a.drawRegion(v.g, bv.a * 14, 0, 14, 14, 0, 2, 34, 0);
      }

      if (this.f) {
         bc.a.drawImage(v.m, 2, 52, 0);
         String var4 = au.b(((long)(this.d * 1000) - (System.currentTimeMillis() - this.a)) / 1000L);
         v.c().a(bc.a, var4, 19, 52, 0);
      }

      r();
      if (this.a.a != null && this.c) {
         bc.a.drawImage(this.a.c, bc.b - 63, 15, 17);
         v.c().a(bc.a, String.valueOf(this.a.a.c), bc.b - 63, 22, 17);
         if (br.a) {
            br.a(44, br.f, br.d, br.g, br.e, bc.b - 48, 20, true);
         } else {
            br.a(44, br.b, br.d, br.c, br.e, bc.b - 48, 20, true);
         }
      }

      if (this.a.c) {
         int var2 = bc.b - 44;
         Image var9;
         if ((var9 = br.a.a(this.a.d)) != null) {
            long var5 = System.currentTimeMillis();
            long var7;
            if ((var7 = this.a.e - (var5 - this.a.d) / 1000L) >= 10L || var5 % 10L < 5L) {
               bc.a.drawImage(var9, var2, 50, 0);
            }

            if (var7 <= 0L) {
               this.a.c = false;
            }
         }
      }

      this.o();
   }

   public final void k() {
      this.w();
      int var10000 = j.a.d;
      String var4 = j.a.b;
      this.a = true;
      if (this.a == null) {
         try {
            this.c = new ec(this, a, new gq(308, "Hun", this));
            Image var1 = Image.createImage("/pet/button/interact.png");
            this.a = new ec(this, var1, new gq(305, "Tương tác pet", this));
            var1 = Image.createImage("/pet/button/petinfor2.png");
            this.g = new ec(this, var1, new gq(310, "Thông tin", this));
            var1 = Image.createImage("/pet/button/equip.png");
            this.h = new ec(this, var1, new gq(311, "Trang bị", this));
            var1 = Image.createImage("/pet/button/inventory.png");
            this.i = new ec(this, var1, new gq(312, "Thùng đồ", this));
            var1 = Image.createImage("/pet/button/xam.png");
            this.b = new ec(this, var1, new gq(332, "Hình xăm", this));
            var1 = Image.createImage("/pet/button/heal.png");
            this.o = new ec(this, var1, new gq(323, "Hồi phục", this));
         } catch (IOException var2) {
            var2.printStackTrace();
         }
      }

      ec[] var3 = new ec[]{this.c, this.b, this.i, this.g, this.h, this.o};
      this.a((ec[])var3);
   }

   public final void l() {
      this.w();
      this.a = true;
      if (this.j == null) {
         this.j = new ec(this, this.a.a, new gq(313, c.a(667), this));
         Image var1 = null;
         Image var2 = null;
         Image var3 = null;
         Image var4 = null;

         try {
            var1 = Image.createImage("/pet/button/petinfor2.png");
            var2 = Image.createImage("/pet/button/equip.png");
            var3 = Image.createImage("/pet/button/guild.png");
            var4 = Image.createImage("/pet/button/guildSkill.png");
         } catch (IOException var6) {
            var6.printStackTrace();
         }

         this.l = new ec(this, var1, new gq(325, "T.tin của bạn", this));
         this.m = new ec(this, var2, new gq(326, "T.bị của bạn", this));
         this.n = new ec(this, var3, new gq(333, "Bang hội", this));
         this.k = new ec(this, this.a.a, new gq(337, "PK", this));
         this.p = new ec(this, var4, new gq(339, "Kĩ năng bang hội", this));
      }

      ec[] var7 = new ec[]{this.k, this.j, this.l, this.m, this.n, this.p};
      this.a((ec[])var7);
   }

   final void a(ez var1) {
      int var2 = var1.a().readInt();
      byte var3 = var1.a().readByte();
      bq var5;
      if ((var5 = (bq)this.a.a(var2)) != null && var5.a != null) {
         cb var4 = new cb(this, this, var3, var5);
         this.b.addElement(var4);
      }

   }

   public final void m() {
      if (this.a == null) {
         Image var2 = null;
         Image var3 = null;
         Image var4 = null;

         try {
            var2 = Image.createImage("/pet/battle/skill.png");
            var3 = Image.createImage("/pet/battle/attack.png");
            var4 = Image.createImage("/pet/battle/potion.png");
         } catch (IOException var6) {
            var6.printStackTrace();
         }

         this.a = new cz(var2);
         this.b = new cz(var3);
         this.c = new cz(var4);
         int var5 = var2.getWidth();
         int var7;
         int var8 = ((var7 = bc.b - 60 - 2) - (var5 << 2)) / 8;
         this.a.a(20, 0, 16, 16);
         int var9 = 20 + var5 + var8;
         this.b.a(var9, 0, 16, 16);
         var9 += var5 + var8;
         this.c.a(var9, 0, 16, 16);
         this.a.d = new gq(320, "Đấm", this);
         this.b.d = new gq(318, "Skill", this);
         this.c.d = new gq(321, "Item", this);
         this.a = new fz(60, bc.c - 37, var7, 16);
         this.a.b = 4;
         this.a.i = true;
         this.a.l = true;
         this.a.c(2);
         this.a.a(this.a);
         this.a.a(this.b);
         this.a.a(this.c);
      }

      this.b.b(false);
      this.c.b(false);
      this.a.l();
      this.b.a(this.a);
      this.b = this.l;
      this.c = this.n;
      this.l = null;
      this.n = null;
      this.a = -1;
      this.b = -1;
   }

   protected final void n() {
      Vector var1 = new Vector();
      if (this.a.a != 12) {
         var1.addElement(new gq("Thông tin bang", new by(this)));
         var1.addElement(new gq("Nộp quỹ bang", new bz(this)));
         var1.addElement(j.k);
         var1.addElement(j.j);
         var1.addElement(new gq(324, "K.tra nhiệm vụ", this));
         var1.addElement(j.i);
         var1.addElement(this.a);
      } else {
         var1.addElement(new gq(41, "Bỏ cuộc", j.a));
         var1.addElement(j.j);
         var1.addElement(j.i);
         var1.addElement(this.a);
      }

      this.a(var1, 1);
   }

   public final void a(int var1) {
      if (v.m == null) {
         try {
            v.m = Image.createImage("/clock.png");
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }

      this.d = var1;
      this.a = System.currentTimeMillis();
      this.f = true;
   }
}
