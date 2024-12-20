public class App {
    public static void main(String[] args) throws Exception {
        Karyawan ridho = new Karyawan("12345", "Ridho");
        Karyawan melan = new Karyawan("12346", "Melan");
        Dosen andiani = new Dosen("23455", "332211", "Andiani");
        Dosen ionia = new Dosen("23456", "332212", "Ionia");

        ridho.getinfo();
        ridho.absenPagi();
        ridho.kerja();
        ridho.absenPulang();

        melan.getinfo();
        melan.absenPagi();
        melan.kerja();
        melan.absenPulang();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        andiani.getinfo();
        andiani.absenPagi();
        andiani.ngajar();
        andiani.absenPulang();

        ionia.getinfo();
        ionia.absenPagi();
        ionia.kerja();
        ionia.absenPulang();
    }
}
