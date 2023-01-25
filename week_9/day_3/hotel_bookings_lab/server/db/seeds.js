use bookings_data;
db.dropDatabase();

db.bookings.insertMany([
  {
    guest_name: "Brian Wagtail",
    guest_email: "brianwagtailn@gmail",
    checked_in: true
  },
  {
    guest_name: "Andromeda Redkite",
    guest_email: "andromedaredkiten@gmail",
    checked_in: true
  },
  {
    guest_name: "Kelsie Egret",
    guest_email: "kegret@gmail.com",
    checked_in: false
  }
]);