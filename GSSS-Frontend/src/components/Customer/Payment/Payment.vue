<!--
Vue class for the payment page.
@author Theo Ghanem + inspired from https://www.w3schools.com/howto/howto_css_checkout_form.asp
-->

<template>
  <div class="row">
    <div class="col-75">
      <div class="container">
        <form action="/action_page.php">

          <div class="row">
            <div class="col-50">
              <h3>Billing Address</h3>
              <label for="fname"><i class="fa fa-user"></i> Full Name</label>
              <input type="text" id="fname" name="firstname" placeholder="John M. Doe">
              <label for="email"><i class="fa fa-envelope"></i> Email</label>
              <input type="text" id="email" name="email" placeholder="john@example.com">
              <label for="adr"><i class="fa fa-address-card-o"></i> Address</label>
              <input type="text" id="adr" name="address" placeholder="542 W. 15th Street">
              <label for="city"><i class="fa fa-institution"></i> City</label>
              <input type="text" id="city" name="city" placeholder="Montreal">

              <div class="row">
                <div class="col-50">
                  <label for="province">Province</label>
                  <input type="text" id="province" name="province" placeholder="Quebec">
                </div>
                <div class="col-50">
                  <label for="zip">Zip</label>
                  <input type="text" id="zip" name="zip" placeholder="H2A 1S6">
                </div>
              </div>
            </div>

            <div class="col-50">
              <h3>Payment</h3>

              <div class="icon-container">
                <i class="fa fa-cc-visa" style="color:navy;"></i>
                <i class="fa fa-cc-amex" style="color:blue;"></i>
                <i class="fa fa-cc-mastercard" style="color:red;"></i>
                <i class="fa fa-cc-discover" style="color:orange;"></i>
              </div>
              <label for="cname">Name on Card</label>
              <input type="text" id="cname" name="cardname" placeholder="John More Doe">
              <label for="ccnum">Credit card number</label>
              <input type="text" id="ccnum" name="cardnumber" placeholder="1111-2222-3333-4444">
              <label for="expmonth">Exp Month</label>
              <input type="text" id="expmonth" name="expmonth" placeholder="September">

              <div class="row">
                <div class="col-50">
                  <label for="expyear">Exp Year</label>
                  <input type="text" id="expyear" name="expyear" placeholder="2030">
                </div>
                <div class="col-50">
                  <label for="cvv">CVV</label>
                  <input type="text" id="cvv" name="cvv" placeholder="352">
                </div>
              </div>
            </div>

          </div>
          <label>
            <input type="checkbox" checked="checked" name="sameadr"> Shipping address same as billing
          </label>
          <input type="submit" v-on:click="backToMain()" value="Shop more!" class="btn">
        </form>
      </div>
    </div>

    <div class="col-25">
      <div class="container">
        <h2>Total <span class="price" style="color:black"><b> {{ total.toFixed(2) }}$</b></span></h2>
      </div>
    </div>
  </div>
</template>

<script src="./payment.js"/>

<style scoped src="./payment.css">
</style>
