#SimpleBaseball
##step-1
hitCount, outCount 관리 필요
###만든 메소드
- 투구 판단 메소드
    - 난수 생성 후 4로 나눈 나머지를 취해 +1하고 ( 나머지가 0인 경우 핸들 )add.Ballcount() 메소드를 호출 }  
      
            - 볼카운트 판단 메소드 
                void addBallcount(){
                투구 판단 메서드에서 리턴받은 integer를 받아 볼카운트에 누적
                3S시 아웃, 4B시 안타 출력, 볼카운트 클리어 메소드 clearBallcount() 호출
                }
                
            - 볼카운트 클리어 메소드
                void clearBallcount(){
                아웃, 안타 발생시 수행
                볼카운트 초기화
                }
                
            - 게임 진행 메소드
                void startGame(){
                게임 시작시 볼카운트, 안타 수, 아웃카운트 초기화
                아웃 카운트가 3이 될때까지 Callball() 메소드 실행
                }
##step-2
팀 클래스와 팀원 클래스 선언

게임 이닝 구분 필요 (step-1이 초,말로 이닝당 2회 수행)

메뉴 구현
    

###TeamInfo.class
    - public class TeamInfo
        TeamMember 인스턴스와 Teamname을 멤버 변수로 갖는 클래스
    
    - public void inputTeamName(String name)
        TeamInfo 클래스의 Teamname 멤버 변수를 세팅하는 메소드
        
    - public void inputTeamMember(int i, String name, double ratio)
        TeamInfo 클래스의 멤버 인스턴스 hitter의 인덱스 i에 name과 ratio를 세팅하는 메소드
        
    - public void printTeamData()
        이 메소드가 호출된 TeamInfo 클래스의 인스턴스가 갖고있는 모든 데이터를 프린트한다
    
    - static void printTeamIndex(ArrayList<TeamInfo> baseballTeams)
        - 메인 메소드의 Print data, play game을 위해서 현재 저장된 TeamInfo 객체의 이름을 출력하는 메소드
    
    
###Ballcount class
    - static void startSixInning(TeamInfo hometeam, TeamInfo awayTeam)
        매개변수 hometeam과 awayteam 사이에서 매 이닝의 수행을 제어하는 메소드
        
    - int startInning(TeamInfo team, int nextHitter)
        startSixInning 메소드에 의해서 호출되며 hometeam의 공격 이닝, away팀의 공격이닝을 제어하는 메소드
        
    - void callBall(double ratio)
        startInning 메소드에 의해서 매 투구시마다 호출되며 현재 타석에 선 타자의 타율을 매개변수로 받아
        심판의 판정을 매개변수로 addBallcount를 호출한다
        
    - void addBallcount(int call)
        심판의 판정을 매개변수로 받아 출력하는 메소드
        
    - void clearBallcount()
        안타 또는 아웃 판정이 나왔을때 볼카운트를 초기화하는 메소드
    
    
###SimpleBaseball.class
    - 사용자로부터 Int값을 입력받아 Input data, Print data, play game으로 분기한다
    