### 第一章 函数与极限
#### 数列极限

##### 数列极限定义
$$
\lim_{n \rightarrow \infty} x_n=a
\Leftrightarrow  
\forall \varepsilon \gt0,
\exists 正整数N, 当n>N时, 有|x_n-a|<\varepsilon.
$$

##### 收敛数列的性质

- 定理1(极限的唯一性)  如果数列${x_n}$收敛, 那么它的极限唯一.
- 定理2(收敛数列的有界性) 如果数列${x_n}$收敛, 那么它一定有界.
- 定理3(收敛数列的保号性) 

$$如果\lim_{n \rightarrow \infty} x_n=a, 且a>0(或a<0), 那么\exists 正整数N, 当n>N时, 有x_n>0(或x_n<0).$$
- 推论

$$如果数列{x_n}从某项起有x_n \ge0(或x_n \le0), 且
\lim_{n \rightarrow \infty} x_n=a, 那么a\ge0(或a \le0)$$
- 定理4(收敛数列与其子列的关系) 如果数列$x_n$收敛于a, 那么它的任一子列也收敛, 且极限也是a.

#### 函数极限
###### 函数极限的定义

- 定义1

$$
\lim_{x \rightarrow x_0}f(x)=A \Leftrightarrow
\forall \varepsilon >0, \exists \delta>0,
当0<|x-x_0|<\delta时, 有|f(x)-A|<\varepsilon.
$$
- 定义2

$$
\lim_{x \rightarrow \infty}f(x)=A \Leftrightarrow
\forall \varepsilon >0, \exists X>0,
当|x|>X时, 有|f(x)-A|<\varepsilon.
$$
##### 函数极限的性质
- 定理1(函数极限的唯一性) 如果$f(x), x\rightarrow x_0$极限存在, 那么这个极限唯一
- 定理2(函数极限的局部有界性)

$$
如果\lim_{x \rightarrow \infty}f(x)=A,
那么存在常数M>0和\delta >0,
使得当0<|x-x_0|<\delta 时,
有|f(x)\le M.
$$
- 定理3(函数极限的局部保号性) 

$$
如果\lim_{x \rightarrow \infty}f(x)=A, 且A>0(或A<0), 
那么存在常数\delta >0, 
有f(x)>0(或f(x)<0).
$$
- 定理3'

$$
如果\lim_{x \rightarrow \infty}f(x)=A(A \neq 0),
那么就存在x_0的某一个去心领域\mathring{U}(x_0),
当x\in \mathring{U}(x_0)时, 就有|f(x)|>\frac {|A|}{2}

$$
- 推论

    $如果在x_0的某去心领域内f(x) \ge 0(或 f(x) \le 0), 而且\lim_{x \rightarrow x_0}f(x)=A,那么A\ge 0(或A\le0)$

- 定理4(函数极限与数列极限的关系)

    $如果极限\lim_{x \rightarrow x_0}f(x) 存在,{x_n}为函数f(x)的定义域内任一收敛于x_0的数列,且满足x_n \neq x_0(n \in N^+),$
    $那么相应的函数值数列f(x_n)必收敛, 且\lim_{n \rightarrow \infty}f(x_n)=\lim_{x \rightarrow x_0}f(x)$
#### 无穷大与无穷小
##### 无穷小
- 定义1

$$

如果函数f(x)当x\rightarrow x_0(或x \rightarrow \infty)时
的极限为零, 那么称函数f(x)为当x\rightarrow x_0(或x \rightarrow
\infty)时的无穷小.
$$

- 定理1 

    $在自变量的同一变化过程中x \rightarrow x_0(或x\rightarrow \infty)中,函数f(x)具有极限A的充分必要条件是f(x)=A+\alpha, 其中\alpha是无穷小.$
##### 无穷大

- 定理2

    $在自变量的同一变化过程中, 如果f(x)为无穷大, 那么\frac{1}{f(x)}为无穷小;反之,如果f(x)为无穷小,且f(x) \neq 0, 那么\frac{1}{f(x)}为无穷大.$
 
 #### 极限的运算法则
 
 - 定理1 两个无穷小的和是无穷小
 (有限个无穷小的和是无穷小)

 - 定理2 有界函数与无穷小的乘积是无穷小

 - 推论1 常数与无穷小的乘积是无穷小

 - 推论2 有限个无穷小的乘积是无穷小

 - 定理3(极限四则运算)
 
  $如果 \lim f(x)=A, \lim g(x)=B ,那么$

(1) $\lim[f(x)\pm g(x)]=\lim f(x) \pm\lim g(x)=A\pm B$

(2) $\lim[f(x) \cdot g(x)]=\lim f(x) \cdot\lim g(x)=A\cdot B$

(3) $若又有B \neq 0,则$

$$ \lim \frac {f(x)}{g(x)}=\frac{\lim f(x)} {\lim g(x)}=\frac A B$$

- 推论1 $如果\lim f(x)存在, c为常数,那么$

$$\lim [cf(x)]=c\lim f(x)$$

- 推论2 $如果\lim f(x)存在, c为常数,那么$

$$\lim [f(x)]^n=[\lim f(x)]^n$$

- 定理4(数列极限四则运算同函数极限四则运算)
- 定理5(比较性质)$如果f(x)\ge g(x), \lim f(x)=A,\lim g(x)=B, 那么A\ge B$
- 定理6(复合函数的极限运算法则)

$$
设函数y=f[g(x)]是有函数u=g(x)和函数y=f(u)复合而成,\\
f[g(x)]在x_0的某去心领域内有定义,\\
若\lim_{x\rightarrow x_0}g(x)=u_0, \lim_{u \rightarrow u_0}f(u)=A, 且存在一个领域,使g(x) \neq u_0,
则 \\
\ \\
\lim_{x\rightarrow x_0}f[g(x)=\lim_{u \rightarrow u_0}f(u)=A
$$

#### 极限存在准则 两个重要极限

- 准则I(夹逼定理) 如果数列${x_n},{y_n},{z_n}$满足如下条件

(1) 从某项起, 即

$\exists n_0 \in N_+, 当n>n_0时,有 y_n\le x_n \le z_n$

(2) $n\rightarrow \infty,\lim y_n = a, \lim z_n = a$, 
那么 ${x_n}$极限存在, 且$\lim x_n = a$

- 准则I' 如果

(1) 当$x \in \mathring{U}(x_0,r)(或|x|>M)$时

$$
g(x) \le f(x) \le h(x)
$$\\
(2) $x \rightarrow x_0(或x \rightarrow \infty) \lim g(x) =A, \lim h(x)=A$,

那么 $\lim f(x)$ 存在, 且等于A.

- 准则II 单调有界数列必有极限

- 准则II' 设函数$f(x)$在$x_0$的某个左领域内单调并且有界,则$f(x)$ 在$x_0$  
的左极限$f(x_0^-)$ 必定存在

#### 无穷小的比较

- 定义 $\lim \frac{\beta}{\alpha}=A$

    如果$\lim \frac{\beta}{\alpha}=0$, 那么$\beta$是$\alpha$的高阶无穷小,记作$\beta=o(\alpha)$

    $A=\infty, 低阶无穷小;A=c\neq0, 同阶无穷小;A=1, 等价无穷小$

    如果$\lim \frac{\beta}{\alpha^k}=c\neq0, k\gt0$, 那么$\beta$是$\alpha$的$k$阶无穷小  
    


- 定理1 $\beta$ 与 $\alpha$是等价无穷小的充分必要条件是  

$$\beta=\alpha + o(\alpha)$$

- 定理2(等价无穷小替换) 求两个无穷小之比极限时, 分子和分母都可以用等价无穷小来替代.

- 无穷小具有自反性,对称性,传递性

#### 函数的连续性与间断点

 

- 函数的连续性定义 设函数$f(x)在点x_0$的某领域内有定义, 如果

$$\lim_{x \rightarrow x_0} f(x) =f(x_0)$$
那么就函数$f(x)在点x_0$ 连续.

- 函数的间断点有以下三种情形  
    $(1) 在x=x_0没有定义$
    $(2) 虽然在x=x_0有定义, 但\lim_{x \rightarrow x_0} f(x) 不存在$
    $(2) 虽然在x=x_0有定义, 且\lim_{x \rightarrow x_0} f(x) 存在$ 
    $但\lim_{x \rightarrow x_0} f(x) \neq f(x_0)$

- 左右极限都存在的是第一类间断点, 非第一类间断点称为第二类间断点.

#### 连续函数的运算 

- 定理1(连续函数四则运算) 连续函数的和差积商都连续, 商时分母不能为0

- 定理2(反函数的连续性) 如果函数在定义域内单调且连续, 那么其反函数,在对应定义域内  
    也单调且连续,并且单调性相同.

- 定理3 复合函数极限

$$
如果 \lim_{x\rightarrow x_0} g(x) = u_0, f(x) 在x=u_0 连续, 那么 \\
\lim_{x\rightarrow x_0} f[g(x)]= f[\lim_{x\rightarrow x_0} g(x)] =f(u_0)
$$

- 定理4(复合函数的连续性) 

设$g(x) 在x_0 连续 g(x_0)=u_0, f(u)在u_0 连续,那么f[g(x)]在x_0$连续.

- 一切初等函数在其定义域内连续

#### 闭区间上连续函数的性质

- 定理1(有界性与最大值最小值定理)

**闭区间**上的连续函数,在该区间内有界, 且一定取得它的最大值与最小值.

- 定理二(零点定理)

    **闭区间**$[a,b]$上的连续函数, 如果两端点的函数值异号,则在**开区间**$(a,b)$内至少有一点$\xi,  
    使得f(\xi)=0$

- 定理三(介值定理) 设函数$f(x)$**闭区间**$[a,b]$上连续, 如果两端点的函数值不同,

$$f(a)=A, f(b)=B$$
    
那么对$A,B$之间的任意一个数$C$, 在开区间$(a,b)$上至少存在一个数$\xi$, 使得$f(\xi)=C (a \lt \xi \lt b)$.

- 推理 在闭区间$[a,b]$上的连续函数$f(x)$的值域为闭区间$[m,M]$,其中$m,与M依次是f(x)在闭区间[a,b]$上的最小值  
    与最大值.

---

### 第二章 导数与微分

#### 导数概念

- 定义

    $f(x),在x_0的领域内有定义$,则导数:

$$f'(x_0)=\lim_{x \rightarrow x_0} \frac{f(x)-f(x_0)}{x-x_0}$$

- 定理(可导的充要条件) 函数$f(x)$在$x_0$处可导的充分必要条件是:左导数和右导数都存在且相等.
- 定理(可导与连续) 函数$f(x)$在$x_0$处可导,那么在该点比连续.

- 定理2(反函数求导) 如果函数在其定义域内单调,可导且不为0,那么它的反函数也可导,且

$$[f^{-1}(x)]'=\frac{1}{f'(y)} 或\frac {dy}{dx}=\frac {1} {\frac {dx}{dy}}$$





 















--- 

### 第四章不定积分

#### 不定积分的概念和性质

#####  原函数与不定积分

- 定义1



- 原函数存在定理: 连续函数一定有原函数

---

### 第五章定积分

#### 定积分的概念与性质

- 定理1 $设f(x)在区间[a,b]上连续,则f(x)在区间[a,b]可积$
- 定理2 $f(x)在区间[a,b]有界, 且只有限个间断点, 则f(x)在区间[a,b]可积$

##### 定积分的性质
- 补充规定

(1)$当b=a时, \int_a^b f(x)dx =0;$

(2)$当a>b时, \int_a^b f(x)dx =-\int_b^a f(x)dx$
- 性质1(线性性质) 设$\alpha,\beta$均为常数,则

$$
\int_a^b[\alpha f(x)+\beta g(x)]dx=\alpha\int_a^b f(x)dx
+\beta\int_a^b g(x)dx
$$
- 性质2(积分区间可加性)

$$
\int_a^b f(x)dx=\int_a^c f(x)dx+\int_c^b f(x)dx
$$
- 性质3

$$\int_a^b 1dx=\int_a^b dx = b-a$$
- 性质4 如果在区间$[a, b]上f(x)\ge 0$, 那么

$$
\int_a^b f(x)dx \ge 0
$$

- 推论1 $如果在区间[a, b]上f(x)\le g(x)$, 那么

$$\int_a^b f(x)dx \le \int_a^b g(x)dx$$

- 推论2

$$|\int_a^b f(x)dx| \le \int_a^b |f(x)|dx$$

- 性质5 $M及m分别是函数f(x)在区间[a,b]上的最大值及最小值,则$

$$m(b-a)\le \int_a^b f(x)dx \le M(b-a)$$

- 性质6(积分中值定理) $如果函数f(x)在积分区间[a,b]上连续,那么在[a,b]至少存在一个点\xi ,使得下式成立:$

$$\int_a^b f(x)dx=f(\xi)(b-a)$$


##### 微积分基本公式

- 定理1 $如果函数f(x)上在[a,b]上连续,那么积分上限函数$

$$\Phi (x) = \int_a^x f(t)dt$$

$在[a,b]上可导,并且它的导数$

$$ \Phi' (x) = \frac d{dx}\int_a^x f(t)dt=f(x)$$

- 定理2 $如果函数f(x)上在[a,b]上连续,那么积分上限函数$

$$\Phi (x) = \int_a^x f(t)dt$$
$就是f(x)在[a,b]上的一个原函数.$

- 定理3(微积分基本定理) $如果函数F(x)是连续函数f(x)在区间[a,b]上的一个原函数,那么$

$$\int_a^b f(x)dx=F(b)-F(a)$$


