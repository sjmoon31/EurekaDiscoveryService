
## 프로젝트 개요
- [기존 모놀리식 아키텍처로 구현된 쇼핑몰 프로젝트](https://github.com/tmdwn725/moon_shop_user)를 마이크로서비스 아키텍처(MSA) 기반으로 리팩토링하여 재구현.
- 모놀리식 아키텍처와 마이크로서비스 아키텍처의 차이에 대한 자세한 내용은 [여기](https://msj725.tistory.com/229)에서 확인할 수 있습니다.

### 기존 흐름도
![image](https://github.com/user-attachments/assets/99f1c559-6e35-4cfe-a2c5-e94f5410b3a3)
- 기능(계정 관리, 상품 관리, 주문 관리 등)이 모두 하나의 모놀리식 애플리케이션에서 처리되며, 사용자 요청이 서버로 직접 전달되어 동작하는 구조.

### MSA로 변경 후 흐름도
![image](https://github.com/user-attachments/assets/31145876-a6d6-4698-9930-dc9ecea0b504)
- 각 기능(계정 서비스, 상품 서비스, 주문 서비스 등)이 독립적인 마이크로서비스로 분리되어 관리되며, 클라이언트 요청은 API Gateway를 통해 각 서비스로 라우팅되고, 서비스 간 통신은 Eureka(서비스 디스커버리)를 통해 이루어지는 구조.


## 서비스 별 주요 기능

### [Discovery 서비스](https://github.com/sjmoon31/EurekaDiscoveryService/tree/master) → ※ 링크 클릭 시 소스 경로로 이동
- 마이크로서비스 아키텍처에서 서비스 간의 상호 작용을 관리
### [Gateway 서비스](https://github.com/sjmoon31/GatewayService/tree/master)
- 서비스간 라우팅 설정
### [사용자 서비스](https://github.com/sjmoon31/MemberService/tree/master)
- 로그인, oauth 로그인, JWT 토큰 인증, 마이페이지
### [상품 서비스](https://github.com/sjmoon31/ProductService/tree/master)
- 상품 정보, 찜한 상품 정보, 리뷰 기능
### [주문 서비스](https://github.com/sjmoon31/OrderService/tree/master)
- 주문 정보, 장바구니, 결제 기능
### [웹 서비스](https://github.com/sjmoon31/WebService/tree/master)
- 상품 페이지 프론트엔드 구현

## 화면

### 로그인
<img src="https://github.com/user-attachments/assets/17d7b4ac-c249-438f-8934-72a42ad51313" width="300">

### 회원가입
<img src="https://github.com/user-attachments/assets/ccdab4e7-a27a-4103-8d2b-7962e2ab0ed5" width="400">

### 메인
![메인](https://github.com/user-attachments/assets/640f8cd2-5407-47de-8181-b9d0715e3325)

### 상품 목록
![상품목록](https://github.com/user-attachments/assets/ea680a0f-b81f-4061-9382-d5269be145a7)

### 상품 상세
![상품상세](https://github.com/user-attachments/assets/8c1ede0d-20ea-445a-a3dc-1593fb6269ff)

### 장바구니
![장바구니](https://github.com/user-attachments/assets/d876131c-1821-4d76-9027-374a119a5f82)

### 결제
![결제](https://github.com/user-attachments/assets/66452bda-0d19-4da4-879c-33d9ab09f3dd)
![결제2](https://github.com/user-attachments/assets/216fcb72-7e3b-4853-9ef7-986ec956bc1f)

### 마이페이지
![마이페이지](https://github.com/user-attachments/assets/6bd4a6b7-6ee2-4b30-99c9-7e2c53791065)

### 주문 내역
![주문내역](https://github.com/user-attachments/assets/f7eea451-0c48-4fb9-b325-4340b47a0b61)

### 좋아요 목록
![좋아요](https://github.com/user-attachments/assets/3facb333-98d6-427b-a1e8-665312ad607b)




