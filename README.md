# Android---Alura
Iniciando estudos do Android pela plataforma Alura.

  ANDROID - sistema operacional open source baseado em linux.
  
 
 Projeto: Agenda Aluno.
 
 COMMIT INICIAL
 
  Inicialização do Projeto:

      Alguns possiveis erros - e como se corrigi-losSincronizando projeto com o Gradle
    Se o problema persistir, use novamente o Find Action, e tente a opção Sync Project with Gradle Files, nessa opção ele vai fazer o processo de sincronização do projeto com os arquivos de configuração de build do Gradle.

    Invalidando cache e reiniciando o Android Studio
    Se a sincronização não for o suficiente, a última alternativa é invalidar o cache, para isso vá no Find Action novamente e execute a opção Invalidate Caches / Restart... e clique na opção Invalidate and Restart.

    Esta opção reinicia o Android Studio, porém, além de reiniciar, no meio do processo ele remove todos os arquivos gerados pela IDE e gera novamente.

    Se o mesmo problema for apresentado, sugerimos que entre em contato com a gente por meio do fórum, indicando a mensagem do problema e, se possível, enviando o projeto via GitHub para que seja possível testar e investigar o problema.


IMPLEMENTANDO ACTIVITY

  Introoducao do conceito de Activity - Ponto de entrada da aplicação Android  
    Composta de VIEW e LOGICA.
    
   Precisa ser formatada:
    1 - Classe chamada MainActivity que extends Activity
    2 - AndroidManifest.xml - precisa configurar a Activity
      dentro da tag <properties>
                        <activity android:name=".MainActivity">
              <intent-filter>  
                <action android:name="android.intent.action.MAIN"/>
                <category android:name="android.intent.category.LAUNCHER"/>
            </intent-filter>
        </activity>
