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

    $在自变量的同一变化过程中x \rightarrow x_0(或x \rightarrow \infty)中,函数f(x)具有极限A的充分必要条件是f(x)=A+\alpha, 其中\alpha是无穷小.$
##### 无穷大

- 定理2

    $在自变量的同一变化过程中, 如果f(x)为无穷大, 那么\frac{1}{f(x)}为无穷小;反之,如果f(x)为无穷小,且f(x) \neq 0, 那么\frac{1}{f(x)}为无穷大.$
 
 #### 极限的运算法则
 
 - 定理1 两个无穷小的和是无穷小
 (有限个无穷小的和是无穷小)

 - 定理2 有界函数与无穷小的乘积是无穷小

 - 推论1 常数与无穷小的乘积是无穷小

 - 推论2 有限个无穷小的乘积是无穷小

 定理3(极限四则运算) $如果 \lim f(x)=A, \lim g(x)=B ,那么$

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



