<template>
  <div class="hello">
    <h1 style="text-align:center;font-size:50px;"> <p style="color:white;"> {{ msg }} </p> </h1>
    <h1 style="text-align:center;font-size:30px;"> <p style="color:#b36b00"> {{ quote }} </p> </h1>
    <br><br>
    <center><img src="../assets/Logo_GSSS.png" alt="centered image" height="300" width="300"> </center>
  </div>
</template>

<script>
export default {
  name: 'hello',
  data () {
    return {
      msg: '',
      quote: '',
      count: 0,
      permission: localStorage.permission,
      quoteBank: [
        '\"Life isn\'t about finding yourself, it is about creating yourself.\"\n\n-George Bernard Shaw',
        '\"If you are going down the right path and you are willing to keep walking, eventually you\'ll make progress.\"\n-Barrack Obama',
        '\"I have far more respect for the person with a single idea who gets there than one with a thousand ideas and does nothing.\"\n-Thomas Edison',
        '\"What is necessary to change a person is to change awareness of himself.\"\n\n-Anonymous',
        '\"Many people die at the age of 25, but their bodies are not buried until 75.\"\n\n-Benjamin Franklin',
        '\"If you don\'t get up every morning with a burning desire to do things, you don\'t have enough goals.\"\n-Lou Holtz',
        '\"The way to learning is to get rid of the arrogance of knowledge.\"\n-Confucius',
        '\"One can have no smaller or greater master than the mastery of oneself.\"\n-Leonardo Da Vinci',
        '\"Empty pockets never held anyone back. Only empty heads and hearts can do that.\"\n-Norman Vincent Peale',
        '\"Great things are not done by impulse, but a series of small things brought together.\"\n-Vincent Van Gogh',
        '\"Why measure your success by the suggestions of society when you can become a success on your own terms.\"\n-Robin Sharma',
        '\"A man may imagine things that are false, but he can only undetsand things that are true.\"\n-Isaac Newton',
        '\"Our fatigue is often caused not by work, but by worry, frustration and resentment.\"\n-Dale Carnegie',
        '\"True freedom is impossible without a mind made free by discipline.\"\n-Mortimer Adler',
        '\"Focus is not saying yes to all important things, rather it is saying no to less important things.\"\n-Steve Jobs',
        '\"Discipline is the bridge between goals and accomplishment.\"\n-Jim Rohn',
        '\"Success in life comes when you simply refuse to give up, with goals so strong that obstacles, failure and loss only act as motivation.\"\n-Jim Rohn',
        '\"Be yourself. Everyone else is already taken.\"\n-Oscar Wilde',
        '\"Be who you are and say what you feel, because those who mind don\'t matter and those who matter don\'t mind.\"\n-Bernard M. Baruch',
        '\"Imperfection is beauty, madness is genius and it\'s better to be absolutely ridiculous than absolutely boring.\"\n-Marilyn Monroe',
        '\"When you are content to be simply yourself and don\'t compare or compete, everyone will respect you.\"\n-Lao Tzu',
        '\"If you are always trying to be ordinary, you will never know how extraordinary you can be.\"\n-Michelangelo',
        '\"Leadership is solving problems. The day people stop bringing you their problems is the day you have stopped leading them.\"\n-Colin Powell',
        '\"Start by doing what\'s necessary; then do what\'s possible and suddenly you are doing the impossible.\"\n-Francis of Assisi',
        '\"It is our choices that show what we truly are, far more than our abilities.\"\n-Albus Dumbledore',
        '\"It does not do to dwell on dreams and forget to live.\"\n-Mirror of Erised'
    ]
    }
  },

  created: function() {
    // Choosing a quote randomly
    this.quote = this.quoteBank[Math.floor(Math.random() * this.quoteBank.length)]

    // Setting the message based on if owner or employee
    if(this.permission == "Employee") {
      this.msg = "Welcome back, dear member of the GSSS staff!"
    }
    else {
      this.msg = "Welcome back, dear owner of the GSSS!"
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
