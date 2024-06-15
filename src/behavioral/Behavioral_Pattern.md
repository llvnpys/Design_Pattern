# Behavioral Patterns

# Stratege Pattern

**알고리즘군을 정의하고 캡슐화해서 각각의 알고리즘군을 수정해서 쓸 수 있게 해준다.**

**전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있다.**



![stratege](https://github.com/llvnpys/Design_Pattern/assets/172395054/43fe21d0-f3f3-48ba-9a7d-7801f5aa85e8)

- 나는 행동, 꽥꽥거리는 행동을 캡슐화한다.
- 오리들을 묶을 Duck 추상 클래스를 만든다.
- 각각 오리들은 Duck를 상속받고, 생성자에 맞는 행동들을 정의해준다.

---

# Command Pattern

---

# Iterator Pattern

---

# Template Method Pattern

---

# State Pattern

---

# Observer Pattern

**한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 연락이 가고 자동으로 내용이 갱신되는 방식으로
일대다 의존성을 정의한다.**

![Observer](https://github.com/llvnpys/Design_Pattern/assets/172395054/c1be09a4-6d7a-406e-9af0-f7095997007b)

- Subject 인터페이스는 observer의 추가, 제거, 필드의 최신화 메서드를 가진다.
- Observer인터페이스는 필드의 update 메서드를 가진다.
- Observer는 subject의 필드를 가지고 있을 필요는 없다. (getter) / 또는 필요한 필드만 들고 변경이 있을 때마다 갱신 가능하다. (setter)


- **Loose Coupling** : 객체들이 상호작용할 수는 있지만, 서로를 잘 모르는 관계를 의미한다.
  느슨한 결합을 활용하면 유연성이 매우 좋아진다. 옵저버 패턴은 느슨한 결합을 보여주는 하나의 예시이다.
    1. subject는 obsever가 특정 인터페이스를 구현한다는 사실만 안다.
    2. observer는 언제든지 새로 추가할 수 있다.
    3. 새로운 형식의 observer를 추가해도 subject를 변경할 필요가 없다.(서로에게 영향을 미치지 않는다.)
    4. subject와 observer는 서로 독립적으로 재사용할 수 있다.

---