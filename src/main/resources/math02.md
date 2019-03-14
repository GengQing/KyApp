### 多项式展开
$$
\begin{aligned}
a^n-b^n&=(a-b)[a^{n-1}+a^{n-2}b+a^{n-3}b^2+\cdots+b^{n-1}]\\

a^3-b^3&=(a-b)(a^2+ab+b^2)\\

a^3+b^3&=(a+b)(a^2-ab+b^2)\\

(a+b)^n&=\sum_{r=0}^n C_n^r a^{n-r}b^r
\end{aligned}
$$

### 三角函数公式


##### 奇变偶不变, 符号看象限.

$$
(n\frac{\pi}{2} \pm a)\\

\sin(\pi + a) = -\sin a\\

\sin(\pi - a) = \sin a\\

\cos(\pi + a) = -\cos a\\

\cos(\pi - a) = -\cos a\\

$$

根据函数图形可知:
- $\sin x \ge 0, x\in[0,\pi]$,即在++第一++和++第二++象限为正值,三四象限为负值
- $\cos x \ge 0, x\in[0,\pi/2] ,[\frac{3\pi}{2},2\pi]$, 即++一和四++象限为正值, 二三象限为负值

总结: 正弦余弦象限先横再竖为正, 正弦上半轴,余弦右半轴为正
- 特殊三角函数值

$$
\begin{aligned}
&\sin(0) = 0& &\sin(\frac {\pi}6)=\frac12& &\sin(\frac {\pi}4)=\frac{\sqrt2}2& &\sin(\frac {\pi}3)=\frac{\sqrt3}2& 
&\sin(\frac {\pi}2)=1&\\
&\cos(0) = 1& &\cos(\frac {\pi}6)=\frac{\sqrt3}2& &\cos(\frac {\pi}4)=\frac{\sqrt2}2& &\cos(\frac {\pi}3)=\frac12& 
&\cos(\frac {\pi}2)=0&\\
&\tan(0) = 0& &\tan(\frac {\pi}6)=\frac{\sqrt3}3& &\tan(\frac {\pi}4)=1&  &\tan(\frac {\pi}3)=\sqrt3& 
&\tan(\frac {\pi}2)=+\infty&\\
\end{aligned}
$$
##### 三角函数公式
$$
\sin x + \cos x = \sqrt 2\sin(x+\frac {\pi}{4})
$$

### 排列组合
$$
C_n^k=\frac{n*(n-1)\cdots(n-k+1)}{k!}\\
\ \\
C_n^k=C_n^{n-k}\\
\ \\
C_5^3=\frac{5\times4\times3}{3\times2\times1}\\
\ \\
C_n^0=1, C_n^n=1


$$
### 重要不等式
* 算数平均值大于等于几何平均值

$$
\frac{a+b}{2} \ge \sqrt{ab}\\
\ \\
ab \le (\frac {a+b}2)^2\\
\ \\
{a+b} \ge 2\sqrt{ab}\\
\ \\
\frac {a_1+\ldots + a_n}{n} \ge \sqrt{a_1 \times \ldots \times a_n}\\
\ \\
x \ge \sin x (x\ge0)\\
\ \\
|x| \gt |\sin x|(x\neq0)\\

$$

* 不等式运算法则

不等式两边乘以负数, 不等号变号

$$
a>b \Rightarrow -a<-b
$$

两边同号时取倒数, 不等号变号

$$
a>b>0 \Rightarrow \frac1a<\frac1b\\

a<b<0 \Rightarrow \frac1a>\frac1b
$$
* 幂函数:

$$
y=x^{\mu}
$$
* 指数函数

$$
y=a^x,(a>0 \& a \neq 1)
$$
* 对数函数

$$
y=\log_a x,(a > 0 \& a \neq 1);  a=e,y=\ln x
$$
* 三角函数

$$
y=\sin x, x\in (-\infty,+\infty),y\in[-1,-1], f(-x)=-f(x), f(x+2\pi)=f(x)
$$
* 反三角函数

$$
y=\arcsin x, x \in [-1,1], y \in[-\frac \pi 2, \frac\pi 2]
$$
## 基本公式
$$
\log_a x = \frac {\ln x} {\ln a}
$$

## 周期函数
$$

f(x)=A\sin(Bx+C)+D, T=\frac {2\pi} B


$$
## 泰勒公式

$$
e^x=1+x+\frac{1}{2!} x^2 + \frac{1}{3!}x^3+...\\

(1+x)^a=1+ax + \frac{a(a-1)}{2!}x^2 + \frac{a(a-1)(a-2)}{3!}x^3+...\\

\frac{1}{1-x}=1+x+x^2+x^3+...\\

\frac{1}{1+x} = 1-x+x^2-x^3+...\\


\ln (1-x) = -x-\frac{1}{2}x^2- \frac{1}{3}x^3 + \cdots\\

\ln (1+x) = x-\frac{1}{2}x^2+ \frac{1}{3}x^3 + \cdots\\


\tan x=x+\frac{x^3}{3}+\cdots\\

\arctan x=x-\frac{x^3}{3}+\cdots\\

\sin x=x-\frac{1}{3!}x^3+\cdots\\

\cos x=1-\frac{1}{2!}x^2+\frac{1}{4!}x^4+\cdots\\
$$

## 等价无穷小
$$
\sin x  \sim  x, \tan x  \sim  x\\

\arcsin x \sim x, \arctan x \sim x\\

1-\cos x  \sim  \frac {x^2} 2\\

1-\sec x=1-\frac 1{\cos x} \sim -\frac {x^2}2\\

$$

$$
e^x-1 \sim x, a^x-1 \sim x\ln a
$$

$$
\ln (1+x) \sim x, \log_a (1+x) \sim \frac x{\ln a}
$$

$$
\sqrt {1+x}-1 \sim \frac x2, (1+x)^a-1 \sim ax
$$

## 导数

$$
\begin{aligned}
&(c)'=0&                          &(x^a)'=ax^{a-1} \\
&(\sqrt x)' = \frac1{2\sqrt x}&   &(\frac 1x)'=-\frac 1{x^2} \\
&(e^x)' = e^x&                    &(a^x)'=a^x\ln a \\
&(\ln x)' = \frac{1}{x}&          &(log_ax)' = \frac{1} {x\ln a} \\
&(\sin x)' = \cos x&              &(\cos x)' = -\sin x \\
&(\tan x)' =\sec^2x=\frac{1}{\cos^2 x}& &(\cot x)'=-\csc^2x=-\frac{1}{\sin^2 x}\\
&(\sec x)' = \sec x \tan x&         &(\csc x)' = -\csc x \cot x\\
&(\arcsin x)' = \frac{1}{\sqrt{1-x^2}}&     &(\arccos x)'=-\frac{1}{\sqrt{1-x^2}} \\
&(\arctan x)' = \frac{1}{1+x^2}&    &(arccot x) = -\frac{1}{1+x^2}\\
\end{aligned}

$$
## 导数四则运算
$$
(u\pm v)' = u' \pm v'\\
(Cv)'=Cv'\\
(uv)' = u'v+uv'\\
(\frac uv)'=\frac{u'v-uv'}{v^2}(v\neq 0)\\
(uvw)'=u'vw+uv'w+uvw'\\
$$

## 复合函数求导

$$y=f[g(x)],y'(x)=f'(u)g'(x)$$

## 幂指函数导数

$$[u^v]'=u^v(u'\frac{v}{u}+v'\ln u)$$


## 高阶导数

$$


(uv)^{(n)}=\sum_{k=0}^n C_n^k u^{(n-k)} v^{(k)}\\

(\sin x)^{(n)} = \sin (x +n\times\frac{\pi}{2})\\

(\cos x)^{(n)} = \cos (x +n\times\frac{\pi}{2})\\

(\frac{1}{1+x})^{(n)} = \frac{(-1)^n n!}{(1+x)^{n+1}}\\

$$
##### 一阶导数只包含y,求二阶导数
$$
\frac {dy}{dx} =f(y)\\

\frac {d^2y}{dx^2} =\frac {d}{dx}(\frac {dy}{dx})\\
=\frac {d}{dy}(f(y))\frac {dy}{dx}\\
=f'(y)f(y)
$$

## 参数方式求导

$$ x=x(t), y=y(t), \frac{dy}{dx}=\frac{y'(t)}{x'(t)}$$

## 积分

$$
\begin{aligned}
&\int a dx = ax+C&               &\int x^ndx=\frac{x^{n+1}}{n+1}+C\\
&\int \frac 1 x dx=\ln |x| +C\\
&\int e^xdx = e^x+C&             &\int a^xdx=\frac{a^x}{\ln a} + C\\
&\int\sin xdx = -\cos x+C&       &\int\cos xdx=\sin x+C\\
&\int\tan xdx = -\ln |\cos x|+C& &\int\cot xdx=\ln |\sin x|+C\\
&\int\sec xdx = \ln|\sec x + \tan x|+C&   &\int\csc xdx=\ln |\csc x - \cot x|+C\\
&\int \sec^2 xdx=\tan x +C&               &\int\csc^2xdx=-cotx +C\\
&\int\frac 1{\sqrt{1-x^2}}dx=\arcsin x+C& &\int\frac{1}{\sqrt{a^2-x^2}}dx=\arcsin \frac xa+C\\
&\int\frac 1{\sqrt{x^2-a^2}}dx=\ln{(x+\sqrt{x^2-a^2})}+C& &\int\frac 1{\sqrt{x^2+a^2}}dx=\ln{(x+\sqrt{x^2+a^2})}+C\\
&\int\frac 1{1+x^2}dx=\arctan x+C& &\int\frac{1}{a^2+x^2}dx=\frac 1a \arctan \frac xa + C\\
&\int\frac 1{x^2-a^2}dx=\frac 1{2a}\ln |\frac{x-a}{x+a}|+C \\
\end{aligned}
$$
#### 补充积分
$$
\int \sin^2 x dx = \frac12 x- \frac14 \sin 2x +C\\

\int \cos^2 x dx = \frac12 x+ \frac14 \sin 2x +C
$$

##### 当n为奇数，乘以1；n为偶数，乘以$\pi/2$
$$
\int_0^{\frac \pi 2} \sin^nxdx=\int_0^{\frac \pi 2}\cos^nxdx=\frac {(n-1)!!} {n!!} *(\frac \pi2 \| 1)\\

\int_0^{\frac \pi 2} f(\sin x)dx=\int_0^{\frac \pi 2}f(\cos x)dx\\

\int_0^{\pi} xf(\sin x)dx = \frac{\pi}{2} \int_0^{\pi} f(\sin x)dx
$$

##### 周期函数积分
$$
\int_a^{a+T} f(x)dx = \int_0^T f(x)dx\\

\int_a^{a+nT} f(x)dx = n\int_0^T f(x)dx
$$


## 反常积分收敛

$$
\int_a^{+\infty} \frac 1 {x^p}dx <=> p>1,a>0
$$
$$
\int_a^{+\infty} \frac 1{x\ln^p x}dx <=> p>1, a>1
$$
$$
\int_a^b \frac 1{(x-a)^p}dx<=> p<1
$$
$$
\int_a^{+\infty}x^ke^{-\lambda x}dx <=> \lambda>0,k>0
$$

## 积分应用
### 弧微分与极坐标转换成参数方程
$$
ds=\sqrt{1+f'^2(x)}dx,ds=\sqrt{x'^2(t)+y'^2(t)}dt
$$
$$
r=r(\theta),x=r(\theta)\cos\theta,y=r(\theta)\sin\theta,
ds=\sqrt{r^2(\theta)+r'^2(\theta)}d\theta
$$
### 旋转体积
    1. f(x)绕x轴旋转体积
$$
V=\pi\int_a^b f^2(x)dx
$$

    2. f(x)绕y轴旋转体积
$$
V=2\pi\int_a^b x|f(x)|dx

V=\pi \int_a^b f^2(y)dy
$$

    3. 截面面积已知的体积
    关键是寻找恰当的截面面积公式
$$
V= \int_a^b f(x) dx
$$

### f(x)绕x轴旋转体侧面积

    1. 直角坐标
    
$$
S=2\pi\int_a^bf(x)\sqrt{1+f'^2(x)}dx
$$
    2. 参数方程
$$
S=2\pi\int_{t1}^{t2}y(t)\sqrt{x'^2(t)+y'^2(t)}dt
, x=x(t),y=y(t)
$$

    3. 极坐标可以转化成参数方程
$$
S=2\pi\int_a^b r(\theta)\sin\theta\sqrt{r^2(\theta)+r'^2(\theta)}d\theta
$$

### 弧长

    1. 参数方程
$$
L=\int_a^b\sqrt{1+f'(x)^2}dx
$$
    2. 参数方程
$$
S=\int_{t_1}^{t_2}\sqrt{x'^2(t)+y'^2(t)}dt
, x=x(t),y=y(t)
$$
    3. 极坐标函数转化成参数方程
$$
x=r(\theta) \cos \theta,y=r(\theta) \sin \theta

s=\int_{\theta_1}^{\theta_2}
\sqrt{r^2(\theta)+r'^2(\theta)}d\theta
$$
### 平面面积 ，x轴时g(x)=0
$$
S=\int_a^b|f(x)-g(x)|dx, 
$$
    1. 极坐标，二重积分化极坐标,交换积分次数得另一个
$$
\iint dxdy=\iint rdrd\theta=\frac 12 \int_{\theta1}^{\theta2}[r(\theta)]^2d\theta
$$
    2. 参数方程，换元积分
$$
S=\int_{t1}^{t2}y(t)x'(t)dt
$$



### f(x)函数的平均值
$$
avg=\frac 1 {(b-a)}\int_a^bf(x)dx
$$
### 积分性质
- 积分区间观原点对称

$$
 \int_{-a}^{a}f(x)dx=
\begin{cases}
2\int_0^af(x)dx,f(-x)=f(x)\\
0,f(-x)=-f(x)\\
\end{cases}
$$
$$
\iint f(x)dxdy=
\begin{cases}
2\iint f(x)dxdy, \in D_1, 
f(-x,-y)=f(x,y)\\
0, f(-x,-y)=-f(x,y)
\end{cases}
$$
- 积分区间关于y轴对称

$$
\iint f(x,y)dxdy=
\begin{cases}
2\iint f(x,y)dxdy, \in D_1, f(-x,y)=f(x,y)\\
0,f(-x,y)=-f(x,y)
\end{cases}
$$
- 积分区间关于x轴对称

$$
\iint f(x,y)dxy=
\begin{cases}
2\iint f(x,y)dxdy, \in D_1, f(x,-y)=f(x,y)\\
0,f(x,-y)=-f(x,y)
\end{cases}

$$
- 积分区间关于y=x, D11 上半部分
$$
\iint f(x,y)dx=\iint f(y,x)dxdy, 
$$

### 二阶常系数线性齐次微分方程
    1. 方程及特征方程
$$
y''+py+q=f(x), \lambda^2+p\lambda+q=0,
$$
    2. 特解，带入方程求系数
$$
f(x)=ax^2+bx+c, y^*=x^k(cx^2+dx+f),k=0,1,2
$$  

$$
f(x)=e^{ax},y^*=cx^ke^{ax},k=0,1,2
$$

$$
f(x)=e^{ax}(bx+c),y^*=x^ke^{ax}(dx+e),k=0,1,2
$$
$$
f(x)=e^{ax}(H_{n1}(x)\cos bx+L_{n2}(x)\sin bx),
y^*=x^ke^{ax}(M_n(x)\cos {bx}+F_n(x)\sin bx), n=max(n1,n2),k=0,1
$$
### 一阶微分方程

    1. 变量可分离微分方程
$$
g(y)dy=f(x)dx \Rightarrow \int g(y)dy = \int f(x)dx
$$

    2. 齐次微分方程
$$
\frac{dy}{dx}=f(\frac yx)\\

令u=\frac yx\\

\int \frac 1{f(u)-u} = \int \frac 1x dx
$$
    3. 一阶线性微分方程
$$
y'+p(x)y=q(x) \ [x'+p(y)x=q(y)]\\

令:u(x)=e^{\int p(x)dx}\\

[yu(x)]'=q(x)u(x)\\

\therefore yu(x)=\int q(x)u(x)dx+C

$$
    4. 可降阶的高阶微方程
$$

1. \ y^{(n)} = f(x)

\Rightarrow y^{(n-1)} = \int f(x) dx +C_1

\Rightarrow y^{(n-2)} = \int [\int f(x) dx +C_1]dx + C_2

\Rightarrow \cdots

$$

