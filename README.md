
## 프로젝트 개요
- [기존 모놀리식 아키텍처로 구현된 쇼핑몰 프로젝트](https://github.com/tmdwn725/moon_shop_user)를 마이크로서비스 아키텍처(MSA) 기반으로 리팩토링하여 재구현.
- 모놀리식 아키텍처와 마이크로서비스 아키텍처의 차이에 대한 자세한 내용은 [여기](https://msj725.tistory.com/229)에서 확인할 수 있습니다.

### 기존 흐름도
![image](https://github.com/user-attachments/assets/99f1c559-6e35-4cfe-a2c5-e94f5410b3a3)
- 기능(계정 관리, 상품 관리, 주문 관리 등)이 모두 하나의 모놀리식 애플리케이션에서 처리되며, 사용자 요청이 서버로 직접 전달되어 동작하는 구조.

### MSA로 변경 후 흐름도
![image](https://github.com/user-attachments/assets/df9b542f-fc12-47d3-87c0-665e387322af)
- 각 기능(계정 서비스, 상품 서비스, 주문 서비스 등)이 독립적인 마이크로서비스로 분리되어 관리되며, 클라이언트 요청은 API Gateway를 통해 각 서비스로 라우팅되고, 서비스 간 통신은 Eureka(서비스 디스커버리)를 통해 이루어지는 구조.


## 서비스 별 주요 기능

#### [Discovery 서비스](https://github.com/sjmoon31/EurekaDiscoveryService/tree/master) → ※ 링크 클릭 시 소스 경로로 이동
- 마이크로서비스 아키텍처에서 서비스 간의 상호 작용을 관리
#### [Gateway 서비스](https://github.com/sjmoon31/GatewayService/tree/master)
- 서비스간 라우팅 설정
#### [사용자 서비스](https://github.com/sjmoon31/MemberService/tree/master)
- 로그인, oauth 로그인, JWT 토큰 인증, 마이페이지
#### [상품 서비스](https://github.com/sjmoon31/ProductService/tree/master)
- 상품 정보, 찜한 상품 정보, 리뷰 기능
#### [주문 서비스](https://github.com/sjmoon31/OrderService/tree/master)
- 주문 정보, 장바구니, 결제 기능



